package org.ktest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource(value = "classpath:example.yml", factory = YamlPropertySourceFactory.class)
public class Example {

    @Value("${example.enabled}")
    private boolean enabled;
    @Value("${example.name}")
    private String name;
    @Value("${example.myArray}")
    private String[] myArray;

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    @Value("${example.myList")
    private List<String> myList;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getMyArray() {
        return myArray;
    }

    public void setMyArray(String[] myArray) {
        this.myArray = myArray;
    }

    @Override
    public String toString() {
        return "Example{" +
                "enabled=" + enabled +
                ", name='" + name + '\'' +
                ", myArray=" + Arrays.toString(myArray) +
                ", myList=" + myList +
                '}';
    }
}
