package com.application.pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface CheckboxDemoLocators {
    By SINGLE_CHECKBOX=By.cssSelector("input[type='checkbox'][id='isAgeSelected']");
    By POST_SINGLE_CHECKBOX_TEXT=By.cssSelector("#txtAge");
    By MULTIPLE_CHECKBOX=By.xpath("//input[@class='cb1-element']");
    By CHECK_ALL=By.cssSelector("input[value='Check All']");

    String Actual_CheckBox_text="Success - Check box is checked";

}
