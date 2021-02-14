package com.application.pages.methods;

import com.application.pages.locators.TableHandlingLocators;
import com.application.utilities.seleniumutils.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.List;

public class TableHandleMethods extends SeleniumActions implements TableHandlingLocators {

    WebDriver driver;

    public TableHandleMethods(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    public void navigateTo_TablePagination()
    {
        click(TABLE_PAGINATION);
        System.out.println(driver.getTitle());

        //get 2nd row 4th coloumn text
        System.out.println(getText(GET_2_4_TEXT));
    }

    public void navigateTo_TableDataSearch()
    {
        click(TABLE_DATASEARCH);
        System.out.println(driver.getTitle());

        //filter with text
        enterText(TASK_TABLE_FILTER,"Bug");
        String expected_text="Bug fixing";
        Assert.assertEquals(getText(TASK_FILTER_TEXT),expected_text);

        //get assigne name by filtered task
        System.out.println(getText(GET_ASSIGNE_BY_TASK));

        //print the entire task filter table

    }

    public void navigateTo_TableSortSearch() throws InterruptedException {
        explicitWaitForSecs(3,TABLE_SORT_SEARCH);
        click(TABLE_SORT_SEARCH);
        System.out.println(driver.getTitle());
        //search with text

        Thread.sleep(4000);
        enterText(SEARCH,"New York");

        //sort with age
        click(AGE_SORT);

        List<WebElement> elements=driver.findElements(BODY);

        for (WebElement element:elements)
        {
            System.out.println(element.getText());
        }
    }

    public void search_ForMaxAge()
    {
        //driver.findElement(By.xpath(String.format(BODY1,4)));
        System.out.println(String.format(BODY1,4));
    }
}
