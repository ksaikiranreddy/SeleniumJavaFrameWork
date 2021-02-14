package com.application.pages.methods;

import com.application.pages.locators.CheckboxDemoLocators;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;

public class CheckboxDemoMethods extends SeleniumActions implements CheckboxDemoLocators {
    WebDriver driver;

    public CheckboxDemoMethods(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void verifySingleCheckbox() {
        implicitWaitForSecs(2);
        click(SINGLE_CHECKBOX);
        Assert.assertEquals(getText(POST_SINGLE_CHECKBOX_TEXT), Actual_CheckBox_text);
    }

    public boolean verifyMultipleCheckbox() throws InterruptedException {
        //int checkbox= driver.findElements(MULTIPLE_CHECKBOX).size();
        List<WebElement> checkboxes = driver.findElements(MULTIPLE_CHECKBOX);
        for(WebElement checkbox:checkboxes)
        {
            if (!(checkbox.isSelected())) {
                System.out.println(checkbox.getText());
                return false;
            }
        }
        return true;
    }

    //this assertion returns true if at least one checkbox is unselected
    public void verifySelectedCheckBoxes() throws InterruptedException {
        Assert.assertFalse(verifyMultipleCheckbox(), "Few checkboxes are unchecked");
    }

    //this assertion returns true if all checkboxes are selected
    public void verifyAllCheckFeature() throws InterruptedException {
        boolean value=true;
        click(CHECK_ALL);
        Thread.sleep(4000);
        Assert.assertTrue(verifyMultipleCheckbox(), "All checkboxes are checked");
    }

}