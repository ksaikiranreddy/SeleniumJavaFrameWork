package com.application.basesetup;

import com.application.utilities.filehandlingutils.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.application.utilities.commons.CommonVariables.configFilePath;

public class BrowserSetup {

    private static WebDriver driver;
    ReadProperties properties;
    Logger logger = LogManager.getLogger("BrowserSetup");


    public WebDriver getDriver() {
        return driver;
    }

    public WebDriver initiateBrowser() {
        properties = new ReadProperties(configFilePath);
        String browser = properties.getProperty("browser");
        logger.info("**************************Test will be run on " + browser + "**************************");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
            WebDriverManager.iedriver().setup();
        }
        driver.manage().window().maximize();
        logger.info("*************************Browser Launched******************************");
        return driver;
    }

    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
        logger.info("**********************Browser Closed*********************************");
    }
}
