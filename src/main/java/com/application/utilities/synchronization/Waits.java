package com.application.utilities.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits {


    WebDriver driver = null;

    public Waits(){
    }

    public Waits(WebDriver driver) {
        this.driver = driver;
    }

    public void implicitWaitForSecs(int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void explicitWaitForSecs(int time, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
