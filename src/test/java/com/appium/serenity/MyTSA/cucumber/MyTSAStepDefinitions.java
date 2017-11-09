package com.appium.serenity.MyTSA.cucumber;

import com.appium.serenity.MyTSA.steps.MyTsaSteps;
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


    @Given("^The MyTSA app opens and updates$")
    public void openMyTsa() {
        LOGGER.info("Main page opens up");
        myTsaSteps.verifyUpdateCheckPage();
        LOGGER.info("'updating status and wait times' Progress bar displays");
        myTsaSteps.verifyGetStartedHeader();
        LOGGER.info("Welcome to MyTSA screen appears");
        myTsaSteps.verifyGetStartedBtn();
    }


    @When("^updates are finished, the User goes through the setup process and allows all permissions$")
    public void updateProgressBar() {

    }

    @Then("^The My Favorites Page appears$")
    public void welcomeScreenAppears() {

    }
}
