package com.application.testsuites;

import com.application.basesetup.BrowserSetup;
import com.application.pages.methods.JavaScriptAlertsMethods;
import com.application.pages.methods.PracticeDashboardMethods;
import com.application.pages.methods.WelcomePageMethods;
import com.application.pages.methods.WindowPopup_Methods;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowPopupPage extends BrowserSetup {
    WelcomePageMethods welcomePageMethods;
    PracticeDashboardMethods practiceDashboardMethods;
    WindowPopup_Methods windowPopup_methods;

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
    public void verifyNavigationToWindowPopup()
    {
        practiceDashboardMethods=new PracticeDashboardMethods(getDriver());
        practiceDashboardMethods.navigate_ToWindowPopup();

        windowPopup_methods=new WindowPopup_Methods(getDriver());
        windowPopup_methods.click_SingleWindow();
        windowPopup_methods.click_MultipleWindow();
    }


    @AfterClass
    public void closeBrowser()
    {
        quitBrowser();
    }
}
