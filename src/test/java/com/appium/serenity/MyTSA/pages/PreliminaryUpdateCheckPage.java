package com.appium.serenity.MyTSA.pages;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class PreliminaryUpdateCheckPage extends BasePage{

    public PreliminaryUpdateCheckPage(WebDriver driver) {
        super(driver);
    }

    @iOSFindBy(accessibility = "TSA_Seal")
    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/seal")
    private WebElement tsaUpdatePage;


    public void isUpdateCheckPageDisplayed() {
        waitForElement(tsaUpdatePage);
    }

}
