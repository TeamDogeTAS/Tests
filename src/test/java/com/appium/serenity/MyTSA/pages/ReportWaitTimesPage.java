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

public class ReportWaitTimesPage extends PageObject {

    public AppiumDriver driver;

    public ReportWaitTimesPage(AppiumDriver driver) {
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

    public void isReportWaitTimesPageDisplayed(){
        BasePage.waitForElement(reportWaitHeader);
    }

    public void clickYesPlease() {
        BasePage.waitForElementToBeClickable(yesPleaseButton).click();
    }

    public void allowLocationServices() {
        BasePage.waitForElementToBeClickable(allowButton).click();
    }
}
