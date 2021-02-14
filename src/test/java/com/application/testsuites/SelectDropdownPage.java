package com.application.testsuites;

import com.application.basesetup.BrowserSetup;
import com.application.pages.methods.PracticeDashboardMethods;
import com.application.pages.methods.SelectDropdownMethods;
import com.application.pages.methods.WelcomePageMethods;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectDropdownPage extends BrowserSetup {

    SelectDropdownMethods selectDropdownMethods;
    PracticeDashboardMethods practiceDashboardMethods;
    WelcomePageMethods welcomePageMethods;

    @BeforeClass
    public void welcome()
    {
        initiateBrowser();
        welcomePageMethods=new WelcomePageMethods(getDriver());
        welcomePageMethods.navigateToWelcomePage();
        //welcomePageMethods.verifyPageTitle();
        welcomePageMethods.closePopup();

        //click start practising
        welcomePageMethods.startPractising();
        System.out.print("welcome - success");
    }

    @Test(enabled = true)
    public void selectDropdown()
    {
        try {
            //navigate from practice page to selenium drop down page
            practiceDashboardMethods = new PracticeDashboardMethods(getDriver());
            practiceDashboardMethods.navigate_ToSelectDropdownList();

            selectDropdownMethods = new SelectDropdownMethods(getDriver());
            selectDropdownMethods.selectSingleValueDropdown();
            selectDropdownMethods.multipleValuesSelectDropdown();
        }
        catch (Exception a)
        {
            System.out.println(a);
        }
    }

    @AfterClass
    public void closeBrowser()
    {
        quitBrowser();
    }

}
