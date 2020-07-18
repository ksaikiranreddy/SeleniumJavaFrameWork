package com.application.pages.locators;

import org.openqa.selenium.By;

public interface HomePageLocators {

    By USERNAME_FIELD = By.xpath("//input[@id='userName']");
    By PASSWORD_FIELD = By.xpath("//input[@id='password']");
    By LOGIN_BUTTON = By.xpath("//button[@id='login']");
    By USER_VERIFICATION = By.xpath("//label[@id='userName-value']");



    /*
    Assertions
    */

    String LOGIN_VERIFICATION_TEXT = "test";
}
