package com.appium.serenity.MyTSA.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportWaitTimesPage extends BasePage {
    public ReportWaitTimesPage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_allow")
    private WebElement yesPleaseButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_do_not_allow")
    private WebElement dontAllowButton;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
    private WebElement denyButton;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private WebElement allowButton;


}
