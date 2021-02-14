package com.application.pages.methods;

import com.application.pages.locators.PracticeDashboardLocators;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.WebDriver;

public class PracticeDashboardMethods extends SeleniumActions implements PracticeDashboardLocators {

   WebDriver driver;

    public PracticeDashboardMethods(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    public void navigate_ToSimpleFormDemo()
    {
        explicitWaitForSecs(3,SIMPLE_FORM_DEMO);
        click(SIMPLE_FORM_DEMO);
    }

    public void navigate_ToCheckboxDemo()
    {
        explicitWaitForSecs(4,CHECK_BOX_DEMO);
        click(CHECK_BOX_DEMO);
    }

    /*public void navigate_ToRadioButtonsDemo()
    {
        explicitWaitForSecs(2,RADIO_BUTTONS_DEMO);
        click(RADIO_BUTTONS_DEMO);
    }
     */

    public void navigate_ToSelectDropdownList()
    {
        explicitWaitForSecs(3,SELECT_DROPDOWN_LIST);
        click(SELECT_DROPDOWN_LIST);
    }

    public void navigate_ToJavaScriptAlertPage()
    {
        explicitWaitForSecs(4,JAVASCRIPT_ALERTS);
        click(JAVASCRIPT_ALERTS);
    }

    public void navigate_ToWindowPopup()
    {
        explicitWaitForSecs(4,WINDOW_POPUP);
        click(WINDOW_POPUP);
    }

    public void navigate_To_TableHandlingPage()
    {
        explicitWaitForSecs(4,TABLE_DEMO);
        click(TABLE_DEMO);
    }
}
