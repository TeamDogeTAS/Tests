package com.appium.serenity.MyTSA.testpages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class GetNotifiedPagetest {

    AppiumDriver driver;

    public GetNotifiedPagetest(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_allow")
    @iOSFindBy(accessibility = "Next")
    WebElement nextButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_notification_header_layout")
    @iOSFindBy(accessibility = "Get notified")
    WebElement getNotifiedHeader;

    public void getnotifiedrdy(){
        waitForElement(getNotifiedHeader);
    }

    public void getnotifiedaction(){
        waitForElementToBeClickable(nextButton).click();
    }

    public WebElement waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitForElementToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }
}
