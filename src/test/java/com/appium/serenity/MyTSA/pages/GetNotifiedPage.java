package com.appium.serenity.MyTSA.pages;

import com.appium.serenity.MyTSA.util.Waits;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class GetNotifiedPage extends PageObject {

    public AppiumDriver driver;

    public GetNotifiedPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_allow")
    @iOSFindBy(accessibility = "Next")
    MobileElement nextButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_notification_header_layout")
    @iOSFindBy(accessibility = "Get notified")
    MobileElement getNotifiedHeader;

    public void clickNext() {
        if(Serenity.sessionVariableCalled("environment").equals("ios")){
            getDriver().switchTo().alert().accept();
        }
        Waits.waitForElementToBeClickable(nextButton).click();
    }

    public void isGetNotifiedPageDisplayed() {
        Waits.waitForElement(getNotifiedHeader);
    }
}
