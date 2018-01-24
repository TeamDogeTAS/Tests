package com.appium.serenity.MyTSA.util;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Waits {

    public static MobileElement waitForElement(MobileElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public static MobileElement waitForElementToBeClickable(MobileElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }
}
