package com.application.pages.locators;

import org.openqa.selenium.By;

public interface TableHandlingLocators {

    By TABLE_PAGINATION=By.xpath("//a[contains(text(),'Table')]/following::ul/li/a[contains(text(),'Table Pagination')]");
    By GET_2_4_TEXT=By.xpath("//table/tbody/tr[2]/td[5]");
    By TABLE_DATASEARCH=By.xpath("//a[contains(text(),'Table Data Search')]");
    By TASK_TABLE_FILTER=By.cssSelector("#task-table-filter");
    By TASK_FILTER_TEXT=By.xpath("//table/tbody/tr/td[contains(text(),'Bug')]");
    By GET_ASSIGNE_BY_TASK=By.xpath("//table/tbody/tr/td[contains(text(),'Bug')]//following-sibling::td");
    By TABLE_SORT_SEARCH=By.xpath("//a[text()='Table Sort & Search']");
    By SEARCH=By.xpath("//input[@type='search']");
    By AGE_SORT=By.xpath("//table/thead/tr/th[text()='Age']");
    By BODY=By.xpath("//table/tbody/tr/td[4]");
    String BODY1="//table/tbody/tr/td[%s]";
    By ENTRIES=By.cssSelector("select[name='example_length']");
}
