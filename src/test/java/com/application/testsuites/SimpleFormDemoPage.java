package com.application.testsuites;

import com.application.basesetup.BrowserSetup;
import com.application.pages.methods.PracticeDashboardMethods;
import com.application.pages.methods.SimpleFormDemoMethods;
import com.application.pages.methods.WelcomePageMethods;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleFormDemoPage extends BrowserSetup {

    PracticeDashboardMethods practiceDashboardMethods;
    SimpleFormDemoMethods simpleFormDemoMethods;
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

    @Test(enabled = true)
    public void simple_form_demo_page()
    {
        practiceDashboardMethods=new PracticeDashboardMethods(getDriver());
        practiceDashboardMethods.navigate_ToSimpleFormDemo();
        System.out.print("Simple form demo - success");
    }

    @Test(enabled = true,dependsOnMethods = {"simple_form_demo_page"})
    public void perform_addition()
    {
        simpleFormDemoMethods=new SimpleFormDemoMethods(getDriver());
        simpleFormDemoMethods.addition_operation();
        System.out.print("Simple form - addition - success");
    }

    @AfterClass
    public void closeBrowser()
    {
        quitBrowser();
    }

}
