package com.appium.serenity.MyTSA.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.*;


public class MyAirportsPage extends BasePage{

    public MyAirportsPage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/app_bar_main_text_view")
    public WebElement pageHeader;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/app_bar_main_image_view")
    private WebElement searchIcon;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/my_airports")
    public WebElement myAirportsTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/guide")
    public WebElement canIBringTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/pre_check")
    public WebElement preCheckTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa")
    public WebElement askTsaTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/profile")
    public WebElement profileTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/about_wait_times_banner_text_view")
    private WebElement waitTimeBanner;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/user_location_text_view")
    private WebElement locationText;

    public void verifyCorrectHeaderIsDisplayed(String header){
        waitForElement(pageHeader);
        assertThat(pageHeader.getText()).isEqualToIgnoringCase(header);
        assertThat(waitTimeBanner.getText()).startsWith("Don't forget");
    }

    public void verifyAllExpectedTabsAreDisplayed() {
        checkTab(canIBringTab, "Can I Bring?");
        checkTab(preCheckTab, "TSA Pre✓®");
        checkTab(askTsaTab,"AskTSA");
        checkTab(profileTab, "My Profile");
    }

    public void checkTab(WebElement element, String headerText){
        waitForElementToBeClickable(element);
        element.click();
        waitForElement(pageHeader);
        assertThat(pageHeader.getText()).isEqualToIgnoringCase(headerText);
    }
}
