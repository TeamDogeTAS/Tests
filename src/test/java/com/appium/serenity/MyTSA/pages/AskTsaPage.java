package com.appium.serenity.MyTSA.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AskTsaPage extends PageObject {

    protected AppiumDriver driver;

    public AskTsaPage(AppiumDriver driver) {
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

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_contact_center_phone")
    private MobileElement contactPhone;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_contact_center_email")
    private MobileElement contactEmail;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_cares_phone")
    private MobileElement caresPhone;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_website_link")
    private MobileElement tsaWebsite;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/item_twitter")
    private MobileElement askTsaTwitter;
}
