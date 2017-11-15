package com.appium.serenity.MyTSA.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CanIBringPage extends BasePage{

    public CanIBringPage(WebDriver driver) {
        super(driver);
    }

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
//
//    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/app_bar_main_text_view")
//    private WebElement pageHeader;

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/item_text_view")
    private WebElement searchBar;

    @AndroidFindBy(accessibility = "Travel Checklist Link")
    private WebElement travelChecklist;

    @AndroidFindBy(accessibility = "Identification Link")
    private WebElement identification;

    @AndroidFindBy(accessibility = "Liquids Rule Link")
    private WebElement liquidsRule;

    @AndroidFindBy(accessibility = "Disabilities and Medical Conditions Link")
    private WebElement disabilitiesAndMedicalConditions;

    @AndroidFindBy(accessibility = "Military Travel Link")
    private WebElement militaryTravel;

    @AndroidFindBy(accessibility = "Travel with Children Link")
    private WebElement travelWithChildren;

}
