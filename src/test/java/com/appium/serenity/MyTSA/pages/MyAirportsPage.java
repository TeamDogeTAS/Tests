package com.appium.serenity.MyTSA.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;


public class MyAirportsPage extends BasePage{

    public MyAirportsPage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "gov.dhs.tsa.mytsa.ite.dev:id/app_bar_main_text_view")
    private WebElement pageHeader;

    public void verifyCorrectHeaderIsDisplayed(String header){
        waitForElement(pageHeader);
        assertThat(pageHeader.getText(), equalToIgnoringCase(header));
    }
}
