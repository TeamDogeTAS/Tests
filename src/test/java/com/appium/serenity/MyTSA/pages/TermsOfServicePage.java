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

public class TermsOfServicePage extends PageObject{

    public AppiumDriver driver;

    public TermsOfServicePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_agree")
    @iOSFindBy(accessibility = "Agree")
    private WebElement agreeButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_disagree_and_exit")
    @iOSFindBy(accessibility = "disagree")
    private WebElement disagreeButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/top")
    @iOSFindBy(accessibility = "You're almost there")
    private WebElement termsPageHeader;

    public void isTermsPageDisplayed() {
        BasePage.waitForElement(termsPageHeader);
        BasePage.waitForElement(agreeButton);
    }

    public void clickAgreeButton(){
        BasePage.waitForElementToBeClickable(agreeButton).click();
    }
}
