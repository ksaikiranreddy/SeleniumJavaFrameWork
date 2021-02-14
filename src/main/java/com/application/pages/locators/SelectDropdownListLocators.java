package com.application.pages.locators;

import org.openqa.selenium.By;

public interface SelectDropdownListLocators {
    By SELECT_SINGLE_VALUE=By.cssSelector(("select#select-demo"));
    By SELECTED_VALUE=By.cssSelector("p.selected-value");
    By MULTI_DROPDOWN=By.cssSelector("#multi-select option");
    By SELECT_ALL=By.cssSelector("#printAll");
    By GET_ALL_SELECTED=By.cssSelector(".getall-selected");

    String selected_day="Tuesday";

}
