package com.appium.serenity.MyTSA.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetStartedPage extends BasePage{

    public GetStartedPage(WebDriver driver) {
        super(driver);
    }

    @iOSFindBy(accessibility = "MyTSA")
    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_mytsa_logo")
    private WebElement myTsaWelcomeHeader;

    @iOSFindBy(accessibility = "Get Started")
    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_get_started")
    private WebElement getStartedButton;

    //@iOSFindBy(accessibility = "Get Started")
    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_button_skip")
    private WebElement skipButton;


    public void isMyTsaHeaderDisplayed(){
        waitForElement(myTsaWelcomeHeader);
        }

    public void isGetStartedBtnDisplayed(){
        waitForElement(getStartedButton);
    }

    public void clickSkipButton() {
        waitForElement(skipButton).click();
    }
}
