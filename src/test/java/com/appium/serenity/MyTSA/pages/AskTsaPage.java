package com.appium.serenity.MyTSA.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AskTsaPage extends BasePage {

    public AskTsaPage(WebDriver driver) {
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

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_contact_center_phone")
    private WebElement contactPhone;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_contact_center_email")
    private WebElement contactEmail;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_cares_phone")
    private WebElement caresPhone;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/ask_tsa_website_link")
    private WebElement tsaWebsite;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/item_twitter")
    private WebElement askTsaTwitter;
}
