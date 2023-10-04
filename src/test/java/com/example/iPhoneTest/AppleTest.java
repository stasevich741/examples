package com.example.iPhoneTest;

import com.example.core.BaseTestSelenide;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * проверяем, что в ссылке есть "iPhone 13"
 */
public class AppleTest extends BaseTestSelenide {

    private static final String BASE_URL = "https://appleinsider.ru/";
    private static final String SEARCH_STRING = "чем iPhone 13 отличается от iPhone 12";
    private static final String EXPECTED_WORD = "iPhone 13";

    @Test
    @Step("проветить ссылку")
    @Tag("iphone_test")
    public void checkHref() {
//        MainPage mainPage = new MainPage(BASE_URL);
//        String href = mainPage.search(EXPECTED_WORD).getHrefFromFirstArticle();
//        Assertions.assertTrue(href.contains(EXPECTED_WORD));

        Assertions.assertTrue(new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getHrefFromFirstArticle()
                .contains(EXPECTED_WORD)
        );
    }
}
