package com.application.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsMethod {

    public  static ExtentReports extentReports;
    public static ExtentReports onStart() {
        String path=System.getProperty("user.dir")+"\\extentreports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);

        extentReports= new ExtentReports();
        extentReports.attachReporter(reporter);
        return extentReports;
    }
}
