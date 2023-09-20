package com.example.iPhoneTest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная станица сайта appleinsider.ru
 */
public class MainPage {
    SelenideElement searchButton = $x("//input[@type='text']");


    public MainPage(String url) {
        Selenide.open(url);
    }

    /**
     * поиск на сайте статей и нажатие enter
     *
     * @param searchTextInput поисковой запрос
     */
    @Test
    @DisplayName("search")
    @Step("ищем текст")
    public SearchPage search(String searchTextInput) {
        searchButton.setValue(searchTextInput);
        searchButton.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
