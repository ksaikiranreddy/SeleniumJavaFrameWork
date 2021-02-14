package com.application.pages.methods;

import com.application.pages.locators.SimpleFormDemoLocators;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SimpleFormDemoMethods extends SeleniumActions implements SimpleFormDemoLocators {

    WebDriver driver;

    public SimpleFormDemoMethods(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    public void addition_operation()
    {
        implicitWaitForSecs(3);
        enterText(ADD_INPUT_FIELD1,a);
        enterText(ADD_INPUT_FIELD2,b);
        click(GET_TOTAL);
        String c=getText(ACTUAL_TOTAL);
        Assert.assertEquals(Integer.parseInt(c),Integer.parseInt(a)+Integer.parseInt(b));
    }
}
