package com.appium.serenity.MyTSA.pages;


import com.appium.serenity.MyTSA.utils.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class PreliminaryUpdateCheckPage extends PageObject {

    public AppiumDriver driver;

    public PreliminaryUpdateCheckPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    @iOSFindBy(accessibility = "TSA_Seal")
    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/seal")
    private WebElement tsaUpdatePage;


    public void isUpdateCheckPageDisplayed() {
        BasePage.waitForElement(tsaUpdatePage);
    }

}
