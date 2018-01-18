package com.appium.serenity.MyTSA.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;


public class MyAirportsPage extends BasePage{

    public MyAirportsPage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/app_bar_main_text_view")
    @iOSFindBy()
    public WebElement pageHeader;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/app_bar_main_image_view")
    @iOSFindBy(accessibility = "Search airports")
    private WebElement searchIcon;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/my_airports")
    @iOSFindBy(accessibility = "My Airports")
    public WebElement myAirportsTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/guide")
    @iOSFindBy(accessibility = "Can I Bring?")
    public WebElement canIBringTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/pre_check")
    @iOSFindBy(accessibility = "TSA Pre✓®")
    public WebElement preCheckTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa")
    @iOSFindBy(accessibility = "AskTSA")
    public WebElement askTsaTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/profile")
    @iOSFindBy(accessibility = "Profile")
    public WebElement profileTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/about_wait_times_banner_text_view")
    @iOSFindBy(accessibility = "Don't forget—you can report wait times once you arrive at the airport! Tap here to learn more.")
    private WebElement waitTimeBanner;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/user_location_text_view")
    private WebElement locationText;

    @iOSFindBy(accessibility = "Favorite Airports")
    private WebElement favoritesText;

    public void verifyCorrectHeaderIsDisplayedAndroid(String header){
        waitForElement(pageHeader);
        assertThat(pageHeader.getText()).isEqualToIgnoringCase(header);
        assertThat(waitTimeBanner.getText()).startsWith("Don't forget");
    }

    public void verifyCorrectHeaderIsDisplayediOS(){
        waitForElement(favoritesText);
        assertThat(waitTimeBanner.getText()).startsWith("Don't forget");
    }

    public void verifyAllExpectedTabsAreDisplayed() {
        checkTabs("Can I Bring?", "TSA Pre✓®", "AskTSA", "My Profile", "My Airports");
    }

    public void checkTabs(String string1, String string2, String string3, String string4, String string5){
        String tabHeaders[] = {string1, string2, string3, string4, string5};
        WebElement tabs[] = {canIBringTab, preCheckTab, askTsaTab, profileTab, myAirportsTab};
        for (int i = 0; i<tabs.length; i++){
            checkTab(tabs[i], tabHeaders[i]);
        }
    }

    public void checkTab(WebElement element, String headerText){
        waitForElementToBeClickable(element);
        element.click();
        waitForElement(pageHeader);
        assertThat(pageHeader.getText()).isEqualToIgnoringCase(headerText);
    }
}
