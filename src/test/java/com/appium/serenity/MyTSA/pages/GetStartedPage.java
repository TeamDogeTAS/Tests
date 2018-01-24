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


public class GetStartedPage extends PageObject {

    public AppiumDriver driver;

    public GetStartedPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    @iOSFindBy(accessibility = "MyTSA")
    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_mytsa_logo")
    private MobileElement myTsaWelcomeHeader;

    @iOSFindBy(accessibility = "Get Started")
    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_get_started")
    private MobileElement getStartedButton;

    @iOSFindBy(accessibility = "Skip")
    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_button_skip")
    private MobileElement skipButton;


    public void isMyTsaHeaderDisplayed(){
        Waits.waitForElement(myTsaWelcomeHeader);
        }

    public void isGetStartedBtnDisplayed(){
        Waits.waitForElement(getStartedButton);
    }

    public void clickSkipButton() {
        Waits.waitForElement(skipButton).click();
    }

    public void clickGetStarted() {
        Waits.waitForElementToBeClickable(getStartedButton).click();
    }
}
