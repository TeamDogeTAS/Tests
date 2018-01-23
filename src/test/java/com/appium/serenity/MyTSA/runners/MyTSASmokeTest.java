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
public class MyTSASmokeTest {

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
    public void androidSmokeTest() {

        myTsaSteps.setUp();
        myTsaSteps.verifyUpdateCheckPage();
        myTsaSteps.verifyGetStartedHeader();
        myTsaSteps.verifyGetStartedBtn();

        myTsaSteps.startSetupProcess();
        myTsaSteps.allowLocationServiceSetUp();
        myTsaSteps.agreeToTerms();

        myTsaSteps.verifyMyAirportsPageOnAndroid();

        myTsaSteps.checkPagesForCorrectnessAndroid();
    }

    @Test
    public void iosSmokeTest() {
        myTsaSteps.setUp();

        myTsaSteps.verifyGetStartedHeader();
        myTsaSteps.verifyGetStartedBtn();

        myTsaSteps.startSetupProcess();
        myTsaSteps.agreeToTermsAndNotification();

        myTsaSteps.verifyMyAirportsPageOnIos();

        myTsaSteps.checkPagesForCorrectnessIOS();
    }
}
