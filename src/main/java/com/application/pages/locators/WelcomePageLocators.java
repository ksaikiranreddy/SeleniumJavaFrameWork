package com.application.pages.locators;

import org.openqa.selenium.By;

public interface WelcomePageLocators {
    String expected_title="Selenium Easy - Best Demo website to practice Selenium Webdriver Online";

    By POPUP_CLOSE= By.xpath("//div[@id='at-cv-lightbox-win']//child::div[@id='at-cv-lightbox-header']//child::a");
    By START_PRACTISE=By.cssSelector("a#btn_basic_example");
}
