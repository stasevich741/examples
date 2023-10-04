package com.example.jenkins;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * ������ ��������
 */

@Tag("allure_test")
public class JenkinsTests {

    @Test
    @Step("false")
    public void test1() {
        assertTrue(false);
    }

    @Test
    @Step("false")
    public void test2() {
        assertTrue(false);
    }

    @Test
    @Step("true")
    public void test3() {
        assertTrue(true);
    }

    @Test
    @Step("true")
    public void test4() {
        assertTrue(true);
    }

    @Test
    @Disabled
    @Step("skiped")
    public void test5() {
        assertTrue(false);
    }
}
