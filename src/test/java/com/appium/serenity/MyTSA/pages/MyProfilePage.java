package com.appium.serenity.MyTSA.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MyProfilePage extends PageObject {

    public AppiumDriver driver;

    public MyProfilePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

//    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/app_bar_main_text_view")
//    private WebElement pageHeader;
//
//    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/my_airports")
//    private WebElement myAirportsTab;
//
//    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/guide")
//    private WebElement canIBringTab;
//
//    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/pre_check")
//    private WebElement preCheckTab;
//
//    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa")
//    private WebElement askTsaTab;
//
//    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/profile")
//    private WebElement profileTab;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/preferences_known_traveler_number")
    private MobileElement travelerNumber;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/mockLocationSwitch")
    private MobileElement mockLocation;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_launch_tutorial")
    private MobileElement launchTutorial;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_about_wait_times")
    private MobileElement aboutWaitTimes;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_app_version_value")
    private MobileElement appVersion;


}
