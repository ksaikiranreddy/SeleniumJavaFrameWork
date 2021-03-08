package com.application.listeners;

import com.application.utilities.seleniumutils.SeleniumActions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;


public class Reports extends SeleniumActions implements ITestListener {

    Logger logger = LogManager.getLogger("Reports");
    ExtentReports extentReports=ExtentReportsMethod.onStart();
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        logger.info("**************************Test Started :" + result.getName());
        test = extentReports.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        logger.info("************************ Test Passed :" + result.getName());
        test.log(Status.PASS, result.getName() + "test passed");
    }


    public void onTestFailure(ITestResult result) {
        logger.error("************************ Test Failed :" + result.getName());
        test.log(Status.FAIL, result.getName() + "test failed");
        test.fail(result.getThrowable());

        try {
            test.addScreenCaptureFromPath(getScreenshot(result.getMethod().getMethodName()),result.getMethod().getMethodName());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void onTestSkipped(ITestResult result) {
        logger.warn("************************ Test Skipped :" + result.getName());
        test.log(Status.SKIP, result.getName() + "test skipped");
    }

        public void onFinish(ITestContext context) {
        extentReports.flush();
    }
}
