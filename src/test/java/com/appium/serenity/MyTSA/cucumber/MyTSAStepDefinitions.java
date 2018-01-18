package com.appium.serenity.MyTSA.cucumber;

import com.appium.serenity.MyTSA.steps.MyTsaSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;



public class MyTSAStepDefinitions {

    @Steps
    MyTsaSteps myTsaSteps;

    @Given("^The MyTSA app opens on Android and updates$")
    public void openMyTsa() {
        myTsaSteps.verifyUpdateCheckPage();
        myTsaSteps.verifyGetStartedHeader();
        myTsaSteps.verifyGetStartedBtn();
    }

    @Given("^The MyTSA app opens on iOS and updates$")
    public void theMyTSAAppOpensOnIOSAndUpdates() {
        myTsaSteps.verifyGetStartedHeader();
        myTsaSteps.verifyGetStartedBtn();
    }

    @When("^updates are finished, the User goes through the setup process and allows all permissions for Android$")
    public void updateProgressBar() {
        myTsaSteps.startSetupProcess();
        myTsaSteps.allowLocationServiceSetUp();
        myTsaSteps.agreeToTerms();
    }

    @When("^updates are finished, the User goes through the setup process and allows all permissions for iOS$")
    public void updatesAreFinishedTheUserGoesThroughTheSetupProcessAndAllowsAllPermissionsForIOS() {
        myTsaSteps.startSetupProcess();
        myTsaSteps.agreeToTerms();
    }

    @And("^the My Airports Page on Android appears$")
    public void androidWelcomeScreenAppears() {
        myTsaSteps.verifyMyAirportsPageOnAndroid();
    }

    @And("^the My Airports Page on iOS appears$")
    public void iosWelcomeScreenAppears() {
        myTsaSteps.verifyMyAirportsPageOnIos();
    }

    @Then("^all pages will be checked for correctness$")
    public void allPagesWillBeCheckedForCorrectness() {
        myTsaSteps.checkPagesForCorrectness();
    }

}
