package com.application.pages.methods;

import com.application.pages.locators.SelectDropdownListLocators;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class SelectDropdownMethods extends SeleniumActions implements SelectDropdownListLocators {

    WebDriver driver;

    public SelectDropdownMethods(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    public void selectSingleValueDropdown()
    {
        Select select=new Select(selectDropDownValue(SELECT_SINGLE_VALUE));
        select.selectByValue("Tuesday");
        Assert.assertEquals(getText(SELECTED_VALUE),"Day selected :- "+selected_day,"Single Dropdown Success");
    }

    public void multipleValuesSelectDropdown()
    {
        Actions actions=new Actions(driver);
        List<WebElement> elements=driver.findElements(MULTI_DROPDOWN);
        for(WebElement element:elements)
        {
            actions.moveToElement(element).keyDown(Keys.CONTROL).click().perform();
        }

        click(SELECT_ALL);
        System.out.println(getText(GET_ALL_SELECTED));
    }
}
