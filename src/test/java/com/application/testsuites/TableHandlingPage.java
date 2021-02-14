package com.application.testsuites;

import com.application.basesetup.BrowserSetup;
import com.application.pages.methods.PracticeDashboardMethods;
import com.application.pages.methods.TableHandleMethods;
import com.application.pages.methods.WelcomePageMethods;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TableHandlingPage extends BrowserSetup {

    PracticeDashboardMethods practiceDashboardMethods;
    TableHandleMethods tableHandleMethods;
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

    @Test(priority = 1,enabled = false)
    public void navigateToTablePagination()
    {
        practiceDashboardMethods=new PracticeDashboardMethods(getDriver());
        practiceDashboardMethods.navigate_To_TableHandlingPage();

        tableHandleMethods=new TableHandleMethods(getDriver());
        tableHandleMethods.navigateTo_TablePagination();
    }

    @Test(priority = 2,enabled = false)
    public void navigateToTableDataSearch()
    {
        practiceDashboardMethods=new PracticeDashboardMethods(getDriver());
        practiceDashboardMethods.navigate_To_TableHandlingPage();

        tableHandleMethods=new TableHandleMethods(getDriver());
        tableHandleMethods.navigateTo_TableDataSearch();
        getDriver().navigate().refresh();
    }

    @Test(priority = 3)
    public void navigateToTableSort_search() throws InterruptedException {
        practiceDashboardMethods=new PracticeDashboardMethods(getDriver());
        practiceDashboardMethods.navigate_To_TableHandlingPage();

        tableHandleMethods=new TableHandleMethods(getDriver());
        tableHandleMethods.navigateTo_TableSortSearch();
        tableHandleMethods.search_ForMaxAge();
    }

    @AfterClass
    public void closeBrowser()
    {
        quitBrowser();
    }
}
