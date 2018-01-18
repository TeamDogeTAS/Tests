package com.appium.serenity.MyTSA.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetNotifiedPage extends BasePage{

    public GetNotifiedPage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_allow")
    @iOSFindBy(accessibility = "Next")
    WebElement nextButton;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/onboarding_notification_header_layout")
    @iOSFindBy(accessibility = "Get notified")
    WebElement getNotifiedHeader;

    public void clickNext() {
        waitForElementToBeClickable(nextButton).click();
        //ios specific
//        getDriver().switchTo().alert().accept();
    }

    public void isGetNotifiedPageDisplayed(){
        waitForElement(getNotifiedHeader);
    }
}
