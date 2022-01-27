package org.ktest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring/example.xml")
@Slf4j
class ExampleTest {

    @Autowired
    private Example example;

    @Test
    void test() {
        log.debug("enabled: {}",example.isEnabled());
        log.debug("name: {}",example.getName());
        log.debug("myArray: {}", Arrays.toString(example.getMyArray()));
        log.debug("myList: {}",example.getMyList());

        assertTrue(example.isEnabled());
        assertEquals("org.ktest", example.getName());
        assertArrayEquals(new String[]{"abc", "def"}, example.getMyArray());
        assertEquals(Arrays.asList("ghi", "jkl"), example.getMyList());

    }

}