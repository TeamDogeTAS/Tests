package com.appium.serenity.MyTSA.pages;

import com.appium.serenity.MyTSA.util.Waits;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.*;


public class MyAirportsPage extends PageObject {

    public AppiumDriver driver;

    public MyAirportsPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 60, TimeUnit.SECONDS), this);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/app_bar_main_text_view")
    public MobileElement pageHeader;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/app_bar_main_image_view")
    @iOSFindBy(accessibility = "Search airports")
    private MobileElement searchIcon;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/my_airports")
    @iOSFindBy(accessibility = "My Airports")
    public MobileElement myAirportsTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/guide")
    @iOSFindBy(accessibility = "Can I Bring?")
    public MobileElement canIBringTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/pre_check")
    @iOSFindBy(accessibility = "TSA Pre✓®")
    public MobileElement preCheckTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa")
    @iOSFindBy(accessibility = "AskTSA")
    public MobileElement askTsaTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/profile")
    @iOSFindBy(accessibility = "Profile")
    public MobileElement profileTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/about_wait_times_banner_text_view")
    @iOSFindBy(accessibility = "Don't forget—you can report wait times once you arrive at the airport! Tap here to learn more.")
    private MobileElement waitTimeBanner;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/user_location_text_view")
    private MobileElement locationText;

    @iOSFindBy(accessibility = "My Airports. Heading Level 1")
    private MobileElement myAirportsHeader;


    public void verifyCorrectHeaderIsDisplayedAndroid(String header) {
        Waits.waitForElement(pageHeader);
        assertThat(pageHeader.getText()).isEqualToIgnoringCase(header);
        assertThat(waitTimeBanner.getText()).startsWith("Don't forget");
    }

    public void verifyCorrectHeaderIsDisplayediOS() {
        Waits.waitForElement(myAirportsHeader);
        assertThat(myAirportsHeader.getText().contains("My Airports"));
        assertThat(waitTimeBanner.getText()).startsWith("Don't forget");
    }

    public void verifyAllExpectedTabsAreDisplayed() {
        checkTabs("Bring", "Pre✓", "Ask", "Profile", "Airports");
    }

    public void checkTabs(String string1, String string2, String string3, String string4, String string5) {
        String tabHeaders[] = {string1, string2, string3, string4, string5};
        MobileElement tabs[] = {canIBringTab, preCheckTab, askTsaTab, profileTab, myAirportsTab};
        if (Serenity.sessionVariableCalled("environment").equals("android")) {
            for (int i = 0; i < tabs.length; i++) {
                checkTabAndroid(tabs[i], tabHeaders[i]);
            }
        } else
            for (int i = 0; i < tabs.length; i++) {
                checkTabIOS(tabs[i], tabHeaders[i]);
            }
    }


    public void checkTabIOS(MobileElement element, String headerText) {
        Waits.waitForElementToBeClickable(element).click();
        assertThat(driver.getPageSource().contains(headerText));
    }

    public void checkTabAndroid(MobileElement element, String headerText) {
        Waits.waitForElementToBeClickable(element).click();
        Waits.waitForElement(pageHeader);
        assertThat(pageHeader.getText()).containsIgnoringCase(headerText);
    }
}
