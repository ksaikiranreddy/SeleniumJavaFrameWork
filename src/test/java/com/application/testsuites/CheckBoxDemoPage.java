package com.application.testsuites;

import com.application.basesetup.BrowserSetup;
import com.application.pages.methods.CheckboxDemoMethods;
import com.application.pages.methods.PracticeDashboardMethods;
import com.application.pages.methods.WelcomePageMethods;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxDemoPage extends BrowserSetup {

    PracticeDashboardMethods practiceDashboardMethods;
    CheckboxDemoMethods checkboxDemoMethods;
    WelcomePageMethods welcomePageMethods;

    @BeforeClass
    public void welcome()
    {
        initiateBrowser();
        welcomePageMethods=new WelcomePageMethods(getDriver());
        welcomePageMethods.navigateToWelcomePage();
        welcomePageMethods.closePopup();

        //click start practising
        welcomePageMethods.startPractising();
        System.out.print("welcome - success");
    }

    @Test(enabled =true)
    public void checkBoxDemoPage() {
        try {
            practiceDashboardMethods = new PracticeDashboardMethods(getDriver());
            practiceDashboardMethods.navigate_ToCheckboxDemo();
            checkboxDemoMethods = new CheckboxDemoMethods(getDriver());
            checkboxDemoMethods.verifySingleCheckbox();
            checkboxDemoMethods.verifySelectedCheckBoxes();
            checkboxDemoMethods.verifyAllCheckFeature();
            System.out.print("check box demo - success");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @AfterClass
    public void closeBrowser()
    {
        quitBrowser();
    }

}
