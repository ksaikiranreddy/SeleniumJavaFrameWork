package com.application.pages.locators;

import org.openqa.selenium.By;

public interface PracticeDashboardLocators {
    By SIMPLE_FORM_DEMO= By.xpath("//div/a[contains(text(),'Simple Form Demo')]");
    By CHECK_BOX_DEMO= By.xpath("//div/a[contains(text(),'Check Box Demo')]");
    By RADIO_BUTTONS_DEMO=By.xpath("//div/a[contains(text(),'Radio Buttons Demo')]");
    By SELECT_DROPDOWN_LIST= By.xpath("//div/a[contains(text(),'Select Dropdown List')]");
    By JAVASCRIPT_ALERTS=By.xpath("//div/a[contains(text(),'Javascript Alerts')]");
    By WINDOW_POPUP=By.xpath("//div/a[contains(text(),'Window Popup Modal')]");
    By TABLE_DEMO=By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Table')]");



}
