package com.application.pages.locators;

import org.openqa.selenium.By;

public interface WindowPopupLocators {

    By SINGLE_WINDOW_POPUP= By.xpath("//div/a[contains(text(),\"  Follow On Twitter \")]");
    By MULTIPLE_WINDOW=By.cssSelector(".two-windows a.btn.btn-primary");
}
