package com.appium.serenity.cucumber;

import com.appium.serenity.steps.MyTsaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyTSAStepDefinitions {

    public final Logger LOGGER= LoggerFactory.getLogger(MyTSAStepDefinitions.class);

    @Steps
    MyTsaSteps myTsaSteps;


    @Given("^The MyTSA update page opens$")
    public void openMyTsa() {
        LOGGER.info("Main page opens up");
        myTsaSteps.verifyUpdateCheckPage();
    }


    @When("^After updating, the Get Started page is displayed$")
    public void updateProgressBar() {
        LOGGER.info("'updating status and wait times' Progress bar displays");
        myTsaSteps.verifyGetStartedHeader();
    }

    @Then("^The Get Started Button appears$")
    public void welcomeScreenAppears() {
        LOGGER.info("Welcome to MyTSA screen appears");
        myTsaSteps.verifyGetStartedBtn();
    }
}
