package com.example.iPhoneTest;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {

    ElementsCollection articlesTitles = $$x("//h2//a");

    /**
     * @return href из первой статьи
     */
    @Step("достать ссылку из первой статьи")
    public String getHrefFromFirstArticle() {
        return articlesTitles.first().getAttribute("href");
    }
}
