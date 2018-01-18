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

public class ReportWaitTimesPagetest{

    AppiumDriver driver;

    public ReportWaitTimesPagetest(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_allow")
    @iOSFindBy(accessibility = "Next")
    private WebElement yesPleaseButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_do_not_allow")
    private WebElement dontAllowButton;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
    private WebElement denyButton;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private WebElement allowButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_location_header_layout")
    @iOSFindBy(accessibility = "Report wait times")
    private WebElement reportWaitHeader;

    public void reportpagerdy(){
        waitForElement(reportWaitHeader);
    }

    public void reportpageaction(){
        waitForElementToBeClickable(yesPleaseButton).click();
        waitForElementToBeClickable(allowButton).click();
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
