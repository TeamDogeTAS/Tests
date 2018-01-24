package com.appium.serenity.MyTSA.runners;

import com.appium.serenity.MyTSA.steps.BeforeAndAfter;
import com.appium.serenity.MyTSA.steps.MyTsaSteps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class MyTSAOnboardingTest {

    @Steps
    BeforeAndAfter beforeAndAfter;
    @Steps
    MyTsaSteps myTsaSteps;

    String os = "ios";

    @Before
    public void setUp(){
        try {
            Serenity.setSessionVariable("environment").to(os);
            beforeAndAfter.startUp(Serenity.sessionVariableCalled("environment"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        beforeAndAfter.stopDriver();
    }

    @Ignore
    public void androidOnboardingTutorialTest() {
        //set up android emulator
        myTsaSteps.setUp();
        //view Onboarding tutorial
        myTsaSteps.verifyUpdateCheckPage();
        myTsaSteps.verifyGetStartedHeader();
        myTsaSteps.verifyGetStartedBtn();
    }

    @Test
    public void iosOnboardingTutorialTest() {
        //set up ios emulator
        myTsaSteps.setUp();
        //verify get started page
        myTsaSteps.verifyGetStartedHeader();
        //tap on get started
        myTsaSteps.viewOnboardingTutorial();
        //swipe through tutorial carousel and verify title
        myTsaSteps.swipeAndVerifyPages();
        //click on next at the top to exit tutorial and continue set up
        myTsaSteps.startSetupProcess();
        myTsaSteps.agreeToTermsAndNotification();
    }

    @Test
    public void declineTermsOfService(){
        myTsaSteps.setUp();

        myTsaSteps.verifyGetStartedHeader();
        myTsaSteps.verifyGetStartedBtn();

        myTsaSteps.startSetupProcess();
        myTsaSteps.disagreeToTermsAndNotification();
    }
}
