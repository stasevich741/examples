package com.example.jenkins;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("allure_test")
public class JenkinsTests {

    @Test
    public void test1() {
        assertTrue(false);
    }

    @Test
    public void test2() {
        assertTrue(false);
    }

    @Test
    public void test3() {
        assertTrue(true);
    }

    @Test
    public void test4() {
        assertTrue(true);
    }

    @Test
    @Disabled
    public void test5() {
        assertTrue(false);
    }
}
