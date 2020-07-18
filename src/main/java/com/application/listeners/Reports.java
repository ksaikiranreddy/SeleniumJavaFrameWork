package com.application.listeners;

import com.application.basesetup.BrowserSetup;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Reports extends BrowserSetup implements ITestListener {

    Logger logger = LogManager.getLogger("Reports");
    ExtentHtmlReporter htmlReporter;
    ExtentReports reports;
    ExtentTest test;
    public Reports() {
    }

    public void onTestStart(ITestResult result) {
        logger.info("**************************Test Started :" + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        logger.info("************************ Test Passed :" + result.getName());
        test.log(Status.PASS, result.getName() + "test passed");
    }

    public void getScreenshot() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
        try {
            File file = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("./screenshots/test-" + date + ".png"));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void onTestFailure(ITestResult result) {
        getScreenshot();
        logger.error("************************ Test Failed :" + result.getName());
        test.log(Status.FAIL, result.getName() + "test failed");
    }

    public void onTestSkipped(ITestResult result) {
        logger.warn("************************ Test Skipped :" + result.getName());
        test.log(Status.SKIP, result.getName() + "test skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public String getCurrentDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date());
    }

    public void onStart(ITestContext context) {
        htmlReporter = new ExtentHtmlReporter("extentReports-" + getCurrentDate() + ".html");
        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);
        String className = this.getClass().getSimpleName();
        test = reports.createTest(className, "Automation Test Report");
    }

    public void onFinish(ITestContext context) {
        reports.flush();

    }
}
