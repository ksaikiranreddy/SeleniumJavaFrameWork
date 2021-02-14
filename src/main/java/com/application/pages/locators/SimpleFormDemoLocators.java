package com.application.pages.locators;

import org.openqa.selenium.By;

public interface SimpleFormDemoLocators {
    By ADD_INPUT_FIELD1=By.cssSelector("input#sum1.form-control");
    By ADD_INPUT_FIELD2=By.cssSelector("input#sum2.form-control");
    By GET_TOTAL=By.xpath("//button[contains(text(),'Get Total')]");
    By ACTUAL_TOTAL=By.xpath("//div/label[contains(text(),' Total a + b = ')]//following::span");

    String a="4";
    String b="5";

}
