package com.application.pages.locators;

import org.openqa.selenium.By;

public interface JavaScriptAlertsLocators {

    By ALERT_BOX=By.cssSelector("button.btn.btn-default[onclick=\"myAlertFunction()\"]");
    By CONFIRM_BOX=By.cssSelector("button.btn.btn-default.btn-lg[onclick=\"myConfirmFunction()\"]");
    By PROMPT_BOX=By.cssSelector("button.btn.btn-default.btn-lg[onclick=\"myPromptFunction()\"]");
    By PROMPT_TEXT=By.cssSelector("#prompt-demo");
}
