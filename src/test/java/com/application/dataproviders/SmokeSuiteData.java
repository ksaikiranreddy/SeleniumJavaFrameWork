package com.application.dataproviders;

import com.application.utilities.filehandlingutils.ExcelUtilities;
import org.testng.annotations.DataProvider;

public class SmokeSuiteData {
    public static final String projectPath = System.getProperty("user.dir");
    public static final String USER_DETAILS = projectPath+"/src/main/resources/testdata/TestUsers.xlsx";
    public static final String LOGIN_SHEET_NAME = "Sheet1";

    ExcelUtilities utils;

@DataProvider
    public Object[][] loginData(){
    utils = new ExcelUtilities(USER_DETAILS, LOGIN_SHEET_NAME);
    Object[][] data = utils.getExcelData();
    return data;
    }
}
