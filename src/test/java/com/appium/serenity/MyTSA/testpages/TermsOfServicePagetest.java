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

public class TermsOfServicePagetest {

    AppiumDriver driver;

    public TermsOfServicePagetest(AppiumDriver driver) {
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

    public void termspagerdy(){
        waitForElement(termsPageHeader);
    }

    public void termspageaction(){
        waitForElementToBeClickable(agreeButton).click();
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
