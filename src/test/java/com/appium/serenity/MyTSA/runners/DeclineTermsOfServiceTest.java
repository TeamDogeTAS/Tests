package com.appium.serenity.MyTSA.runners;

import com.appium.serenity.MyTSA.steps.BeforeAndAfter;
import com.appium.serenity.MyTSA.steps.MyTsaSteps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.appium.serenity.MyTSA.util.HelperMethods.readAndGrabProps;

@RunWith(SerenityRunner.class)
public class DeclineTermsOfServiceTest extends PageObject{

    @Steps
    BeforeAndAfter beforeAndAfter;
    @Steps
    MyTsaSteps myTsaSteps;

    @Before
    public void setUp(){
        try {
            beforeAndAfter.startUp(readAndGrabProps("environment"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        beforeAndAfter.stopDriver();
    }

    @Test
    @WithTag("test:ios terms test")
    public void declineTermsOfService(){
        myTsaSteps.testSetUp();

        myTsaSteps.verifyGetStartedHeader();
        myTsaSteps.verifyGetStartedBtn();

        myTsaSteps.startSetupProcess();
        myTsaSteps.disagreeToTermsAndNotification();
    }
}
