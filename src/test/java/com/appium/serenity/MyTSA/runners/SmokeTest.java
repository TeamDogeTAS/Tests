//package com.appium.serenity.MyTSA.runners;
//
//
//import com.appium.serenity.MyTSA.steps.BeforeAndAfter;
//import com.appium.serenity.MyTSA.steps.MyTsaSteps;
//import net.serenitybdd.core.Serenity;
//import net.serenitybdd.junit.runners.SerenityRunner;
//import net.thucydides.core.annotations.Steps;
//import net.thucydides.core.annotations.WithTag;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import static com.appium.serenity.MyTSA.util.HelperMethods.readAndGrabProps;
//
//
//@RunWith(SerenityRunner.class)
//public class SmokeTest {
//
//    @Steps
//    BeforeAndAfter beforeAndAfter;
//    @Steps
//    MyTsaSteps myTsaSteps;
//
//    @Before
//    public void setUp(){
//        try {
//            String os = readAndGrabProps("environment");
//            Serenity.setSessionVariable("environment").to(os);
//            beforeAndAfter.startUp(os);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @After
//    public void tearDown() {
//        beforeAndAfter.stopDriver();
//    }
//
//    @Ignore
//    @WithTag("test:android smoke test")
//    public void androidSmokeTest() {
//
//        myTsaSteps.testSetUp();
//        myTsaSteps.verifyUpdateCheckPage();
//        myTsaSteps.verifyGetStartedHeader();
//        myTsaSteps.verifyGetStartedBtn();
//
//        myTsaSteps.startSetupProcess();
//        myTsaSteps.allowLocationServiceSetUp();
//        myTsaSteps.agreeToTerms();
//
//        myTsaSteps.verifyMyAirportsPageOnAndroid();
//
//        myTsaSteps.checkPagesForCorrectnessAndroid();
//    }
//
//    @Test
//    @WithTag("test:ios smoke test")
//    public void iosSmokeTest() {
//        //set up ios emulator
//        myTsaSteps.testSetUp();
//        //Get started page, skip tutorial
//        myTsaSteps.verifyGetStartedHeader();
//        myTsaSteps.verifyGetStartedBtn();
//        //go through onboarding setup
//        myTsaSteps.startSetupProcess();
//        myTsaSteps.agreeToTermsAndNotification();
//
//        myTsaSteps.verifyMyAirportsPageOnIos();
//
//        myTsaSteps.checkPagesForCorrectnessIOS();
//    }
//}
