package com.application.pages.methods;

import com.application.pages.locators.JavaScriptAlertsLocators;
import com.application.pages.locators.PracticeDashboardLocators;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JavaScriptAlertsMethods extends SeleniumActions implements JavaScriptAlertsLocators {

    WebDriver driver;

    public JavaScriptAlertsMethods(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    //click and open alert box and get the alert text
    public void click_ClickMe()
    {
        click(ALERT_BOX);
        System.out.println(handleAlerts().getText());
        driver.switchTo().alert().accept();
    }

    //click and open the confirm box and click cancel
    public void click_ConfirmBox()
    {
        click(CONFIRM_BOX);
        System.out.println(handleAlerts().getText());
        handleAlerts().dismiss();
    }

    //click and open the prompt box and send some text
    public void click_PromptBox()
    {
        click(PROMPT_BOX);
        handleAlerts().sendKeys("hey hi");
        handleAlerts().accept();
        System.out.println(getText(PROMPT_TEXT));
        Assert.assertEquals("You have entered 'hey hi' !",getText(PROMPT_TEXT));
    }

}
