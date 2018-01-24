package com.appium.serenity.MyTSA.pages;

import com.appium.serenity.MyTSA.util.Waits;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.PageObject;
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
    private MobileElement yesPleaseButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_do_not_allow")
    private MobileElement dontAllowButton;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
    private MobileElement denyButton;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private MobileElement allowButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_location_header_layout")
    @iOSFindBy(accessibility = "Report wait times")
    private MobileElement reportWaitHeader;

    public void isReportWaitTimesPageDisplayed(){
        Waits.waitForElement(reportWaitHeader);
    }

    public void clickYesPlease() {
        Waits.waitForElementToBeClickable(yesPleaseButton).click();
    }

    public void allowLocationServices() {
        Waits.waitForElementToBeClickable(allowButton).click();
    }
}
