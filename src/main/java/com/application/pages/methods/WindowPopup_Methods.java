package com.application.pages.methods;

import com.application.pages.locators.WindowPopupLocators;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.util.Iterator;
import java.util.Set;

public class WindowPopup_Methods extends SeleniumActions implements WindowPopupLocators {

    WebDriver driver;

    public WindowPopup_Methods(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }


    public void click_SingleWindow()
    {
        click(SINGLE_WINDOW_POPUP);
        handle_windows();

    }

    public void click_MultipleWindow()
    {
        click(MULTIPLE_WINDOW);
        handle_windows();
    }

}
