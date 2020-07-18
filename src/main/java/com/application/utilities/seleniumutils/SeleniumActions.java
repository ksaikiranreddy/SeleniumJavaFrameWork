package com.application.utilities.seleniumutils;

import com.application.utilities.synchronization.Waits;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumActions extends Waits {

    public WebDriver driver;
    Logger logger = LogManager.getLogger("SeleniumActions");
    public SeleniumActions() {
    }

    public SeleniumActions(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void navigateToURL(String url) {
        driver.get(url);
        logger.info("Navigated to :" + url);
    }

    public void enterText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
        logger.info("Entered " + text + " in " + locator);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
        logger.info("Clicking on element " + locator);
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

}
