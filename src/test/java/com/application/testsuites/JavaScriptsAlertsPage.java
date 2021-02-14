package com.application.testsuites;

import com.application.basesetup.BrowserSetup;
import com.application.pages.locators.PracticeDashboardLocators;
import com.application.pages.methods.JavaScriptAlertsMethods;
import com.application.pages.methods.PracticeDashboardMethods;
import com.application.pages.methods.WelcomePageMethods;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptsAlertsPage extends BrowserSetup {

    WelcomePageMethods welcomePageMethods;
    PracticeDashboardMethods practiceDashboardMethods;
    JavaScriptAlertsMethods javaScriptAlertsMethods;

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

    @Test
    public void navigate_JavascriptAlertPage()
    {
        try{
            practiceDashboardMethods=new PracticeDashboardMethods(getDriver());
            practiceDashboardMethods.navigate_ToJavaScriptAlertPage();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void verifyAlertBox()
    {
        try{
            javaScriptAlertsMethods=new JavaScriptAlertsMethods(getDriver());
            javaScriptAlertsMethods.click_ClickMe();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void verifyConfirmBox()
    {
        try{
            javaScriptAlertsMethods=new JavaScriptAlertsMethods(getDriver());
            javaScriptAlertsMethods.click_ConfirmBox();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void verifyPromptBox()
    {
        try{
            javaScriptAlertsMethods=new JavaScriptAlertsMethods(getDriver());
            javaScriptAlertsMethods.click_PromptBox();
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
