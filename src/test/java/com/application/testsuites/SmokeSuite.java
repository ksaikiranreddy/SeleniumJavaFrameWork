package com.application.testsuites;

import com.application.basesetup.BrowserSetup;
import com.application.dataproviders.SmokeSuiteData;
import com.application.pages.methods.*;
import org.testng.annotations.Test;

public class SmokeSuite extends BrowserSetup {

    HomePageMethods homePageMethods;

    @Test(dataProvider = "loginData", dataProviderClass = SmokeSuiteData.class, enabled = false)
    public void login(String userName, String password) {
        homePageMethods = new HomePageMethods(getDriver());
        homePageMethods.performLogin(userName, password);
        homePageMethods.verifyLogin();
    }

}
