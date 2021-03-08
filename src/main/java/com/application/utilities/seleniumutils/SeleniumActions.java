package com.application.utilities.seleniumutils;

import com.application.utilities.synchronization.Waits;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

public class SeleniumActions extends Waits {

    public WebDriver driver;
    Logger logger = LogManager.getLogger("SeleniumActions");
    public SeleniumActions() {
    }

    public SeleniumActions(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void navigateToURL(String url) {
        driver.get(url);
        logger.info("Navigated to :" + url);
    }

    public void enterText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
        logger.info("Entered " + text + " in " + locator);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
        logger.info("Clicking on element " + locator);
    }

    public WebElement selectDropDownValue(By locator)
    {
        logger.info("selecting element from dropdown"+locator);
        return driver.findElement(locator);
    }

    public Alert handleAlerts()
    {
        logger.info("actions on alert");
        Alert alert=new Alert() {
            public void dismiss() {
                driver.switchTo().alert().dismiss();
            }

            public void accept() {
                driver.switchTo().alert().accept();
            }

            public String getText() {
                return driver.switchTo().alert().getText();
            }

            public void sendKeys(String s) {
                driver.switchTo().alert().sendKeys(s);
            }
        };
        return alert;
    }

    //handling multiple windows
    public void handle_windows()
    {
        String main_window=driver.getWindowHandle();

        Set<String> windowhandles=driver.getWindowHandles();
        Iterator<String> i=windowhandles.iterator();
        while(i.hasNext())
        {
            String child_window=i.next();

            if(!main_window.equalsIgnoreCase(child_window))
            {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                driver.close();
            }
        }

        driver.switchTo().window(main_window);

    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public String getScreenshot(String methodName) {

        String path=System.getProperty("user.dir")+"\\screenshots\\"+methodName+".png";
        try {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File(path));
        } catch (Exception e) {
            e.getMessage();
        }
        return path;
    }

}
