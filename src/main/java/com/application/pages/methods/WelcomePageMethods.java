package com.application.pages.methods;

import com.application.pages.locators.WelcomePageLocators;
import com.application.utilities.filehandlingutils.ReadProperties;
import com.application.utilities.seleniumutils.SeleniumActions;
import com.application.utilities.commons.CommonVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.application.utilities.commons.CommonVariables.configFilePath;

public class WelcomePageMethods extends SeleniumActions implements WelcomePageLocators {

    WebDriver driver;
    ReadProperties properties=new ReadProperties(configFilePath);
    public WelcomePageMethods(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    public void navigateToWelcomePage()
    {
        navigateToURL(properties.getProperty("url"));
        System.out.println(driver.getTitle());
    }

   /* public void verifyPageTitle()
    {
        String actual_title=driver.getTitle();
        Assert.assertEquals(actual_title,expected_title,"Title matched");
    }
    */

    //close the cookie popup
    public void closePopup()
    {
        explicitWaitForSecs(5,POPUP_CLOSE);
        click(POPUP_CLOSE);
    }

    //start navigation button click
    public void startPractising()
    {
        click(START_PRACTISE);
    }
}
