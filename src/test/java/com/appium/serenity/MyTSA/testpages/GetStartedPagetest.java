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


public class GetStartedPagetest {

    AppiumDriver driver;

    public GetStartedPagetest(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    @iOSFindBy(accessibility = "MyTSA")
    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_mytsa_logo")
    private WebElement myTsaWelcomeHeader;

    @iOSFindBy(accessibility = "Get Started")
    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_get_started")
    private WebElement getStartedButton;

    @iOSFindBy(accessibility = "Skip")
    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_button_skip")
    private WebElement skipButton;

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

    public void getstartedrdy(){
        waitForElement(myTsaWelcomeHeader);
        waitForElement(getStartedButton);
    }
    public void getstartedaction(){
        waitForElementToBeClickable(skipButton).click();
    }
}
