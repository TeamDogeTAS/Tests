package com.appium.serenity.MyTSA.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfilePage extends BasePage{
    public MyProfilePage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/app_bar_main_text_view")
    private WebElement pageHeader;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/my_airports")
    private WebElement myAirportsTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/guide")
    private WebElement canIBringTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/pre_check")
    private WebElement preCheckTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa")
    private WebElement askTsaTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/profile")
    private WebElement profileTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/preferences_known_traveler_number")
    private WebElement travelerNumber;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/mockLocationSwitch")
    private WebElement mockLocation;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_launch_tutorial")
    private WebElement launchTutorial;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_about_wait_times")
    private WebElement aboutWaitTimes;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_app_version_value")
    private WebElement appVersion;


}
