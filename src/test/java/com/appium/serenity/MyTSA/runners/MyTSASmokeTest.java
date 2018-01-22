package com.appium.serenity.MyTSA.runners;


import com.appium.serenity.MyTSA.steps.BeforeAndAfter;
import com.appium.serenity.MyTSA.steps.MyTsaSteps;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.*;
import org.junit.runner.RunWith;

import static java.util.concurrent.TimeUnit.SECONDS;


@RunWith(SerenityRunner.class)
public class MyTSASmokeTest {

    @Steps
    BeforeAndAfter beforeAndAfter;
    @Steps
    MyTsaSteps myTsaSteps;

    @Before
    public void setUp(){
        try {
            beforeAndAfter.startUp("android");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        beforeAndAfter.stopDriver();
    }

    @Test
    public void androidSmokeTest() {

        myTsaSteps.setUp();
        myTsaSteps.verifyUpdateCheckPage();
        myTsaSteps.verifyGetStartedHeader();
        myTsaSteps.verifyGetStartedBtn();

        myTsaSteps.startSetupProcess();
        myTsaSteps.allowLocationServiceSetUp();
        myTsaSteps.agreeToTerms();

        myTsaSteps.verifyMyAirportsPageOnAndroid();

        myTsaSteps.checkPagesForCorrectness();
    }

    @Ignore
    public void iosSmokeTest() {
        myTsaSteps.verifyGetStartedHeader();
        myTsaSteps.verifyGetStartedBtn();

        myTsaSteps.startSetupProcess();
        myTsaSteps.agreeToTerms();

        myTsaSteps.verifyMyAirportsPageOnIos();

        myTsaSteps.checkPagesForCorrectness();
    }
}
