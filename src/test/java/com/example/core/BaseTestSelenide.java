package com.example.core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTestSelenide {

    @BeforeAll
    public static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
//        WebDriverManager.chromedriver().setup();
//        Configuration.driverManagerEnabled = true;
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
    }

    @BeforeEach
    public void init() {
        setUpAll();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}

