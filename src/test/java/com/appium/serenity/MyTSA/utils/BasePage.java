package com.appium.serenity.MyTSA.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BasePage {

    public static WebElement waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public static WebElement waitForElementToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }
}
