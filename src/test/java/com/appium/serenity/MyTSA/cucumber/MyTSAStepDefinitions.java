package com.appium.serenity.MyTSA.cucumber;

import com.appium.serenity.MyTSA.steps.MyTsaSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;



public class MyTSAStepDefinitions {

    @Steps
    MyTsaSteps myTsaSteps;

    @Given("^The MyTSA app opens and updates$")
    public void openMyTsa() {
        myTsaSteps.verifyUpdateCheckPage();
        myTsaSteps.verifyGetStartedHeader();
        myTsaSteps.verifyGetStartedBtn();
    }


    @When("^updates are finished, the User goes through the setup process and allows all permissions$")
    public void updateProgressBar() {
        myTsaSteps.startSetupProcess();
        myTsaSteps.allowLocationServiceSetUp();
    }

    @And("^the My Favorites Page appears$")
    public void welcomeScreenAppears() {
        myTsaSteps.verifyMyAirportsPage();
    }

    @Then("^all pages will be checked for correctness$")
    public void allPagesWillBeCheckedForCorrectness() {
        myTsaSteps.checkPagesForCorrectness();
    }

}
