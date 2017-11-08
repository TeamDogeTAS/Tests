package com.appium.serenity.MyTSA.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TermsOfServicePage extends BasePage{
    public TermsOfServicePage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_agree")
    private WebElement agreeButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_disagree_and_exit")
    private WebElement disagreeButton;
}
