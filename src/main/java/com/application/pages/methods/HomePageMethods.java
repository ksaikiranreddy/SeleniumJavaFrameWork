package com.application.pages.methods;

import com.application.pages.locators.HomePageLocators;
import com.application.utilities.filehandlingutils.ReadProperties;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.application.utilities.commons.CommonVariables.configFilePath;

public class HomePageMethods extends SeleniumActions implements HomePageLocators {
    WebDriver driver;
    ReadProperties properties;

    public HomePageMethods(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void performLogin(String userName, String password) {
        properties = new ReadProperties(configFilePath);
        navigateToURL(properties.getProperty("url"));
        enterText(USERNAME_FIELD, userName);
        enterText(PASSWORD_FIELD, password);
        click(LOGIN_BUTTON);
    }

    public void verifyLogin() {
        explicitWaitForSecs(5, USER_VERIFICATION);
        String userName = getText(USER_VERIFICATION);
        Assert.assertEquals(userName, LOGIN_VERIFICATION_TEXT, "User is not logged in");
    }
}
