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

import static org.assertj.core.api.Assertions.assertThat;

public class TermsOfServicePage extends PageObject{

    public AppiumDriver driver;

    public TermsOfServicePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_agree")
    @iOSFindBy(accessibility = "Agree")
    private MobileElement agreeButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_disagree_and_exit")
    @iOSFindBy(accessibility = "disagree")
    private MobileElement disagreeButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/top")
    @iOSFindBy(accessibility = "You're almost there")
    private MobileElement termsPageHeader;

    @iOSFindBy(accessibility = "Ok")
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement okAfterDecliningTerms;

    @AndroidFindBy(id = "android:id/message")
    private MobileElement messageAfterDeclining;

    public void isTermsPageDisplayedIOS() {
        driver.switchTo().alert().accept();
        Waits.waitForElement(termsPageHeader);
        Waits.waitForElement(agreeButton);
    }

    public void isTermsPageDisplayed() {
        Waits.waitForElement(termsPageHeader);
        Waits.waitForElement(agreeButton);
    }

    public void clickOkAfterDeclining(){
        Waits.waitForElementToBeClickable(disagreeButton).click();
        Waits.waitForElementToBeClickable(okAfterDecliningTerms).click();
    }

    public void clickAgreeButton(){
        Waits.waitForElementToBeClickable(agreeButton).click();
    }

    public void declineTerms() {
        Waits.waitForElement(termsPageHeader);
        Waits.waitForElementToBeClickable(disagreeButton).click();
        Waits.waitForElement(messageAfterDeclining);
        assertThat(messageAfterDeclining.getText())
                .contains("You must agree to the terms of service in order to use this app.");
    }

    public void clickOkAndCloseApp() {
        Waits.waitForElementToBeClickable(okAfterDecliningTerms).click();
    }
}
