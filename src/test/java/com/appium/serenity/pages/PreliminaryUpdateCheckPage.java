package com.appium.serenity.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PreliminaryUpdateCheckPage extends BasePage{

    public PreliminaryUpdateCheckPage(WebDriver driver) {
        super(driver);
    }

    @iOSFindBy(accessibility = "TSA_Seal")
    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/seal")
    private WebElement tsaUpdatePage;


    public void isUpdateCheckPageDisplayed() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOf(tsaUpdatePage));
        System.out.println("TSA update page Found");
    }

}
