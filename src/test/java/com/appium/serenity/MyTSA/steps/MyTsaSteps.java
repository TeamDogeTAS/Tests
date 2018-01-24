package com.appium.serenity.MyTSA.steps;


import com.appium.serenity.MyTSA.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static com.appium.serenity.MyTSA.steps.BeforeAndAfter.driver;

public class MyTsaSteps extends ScenarioSteps{

    PreliminaryUpdateCheckPage preliminaryUpdateCheckPage;
    GetStartedPage getStartedPage;
    ReportWaitTimesPage reportWaitTimesPage;
    GetNotifiedPage getNotifiedPage;
    TermsOfServicePage termsOfServicePage;
    MyAirportsPage myAirportsPage;
    GetStartedTutorialPage getStartedTutorialPage;

    @Step
    public void setUp() {
        preliminaryUpdateCheckPage = new PreliminaryUpdateCheckPage(driver);
        getStartedPage = new GetStartedPage(driver);
        reportWaitTimesPage = new ReportWaitTimesPage(driver);
        getNotifiedPage = new GetNotifiedPage(driver);
        termsOfServicePage = new TermsOfServicePage(driver);
        myAirportsPage = new MyAirportsPage(driver);
        getStartedTutorialPage = new GetStartedTutorialPage(driver);
    }

    @Step
    public void verifyUpdateCheckPage(){
        preliminaryUpdateCheckPage.isUpdateCheckPageDisplayed();
    }

    @Step
    public void verifyGetStartedHeader(){
        getStartedPage.isMyTsaHeaderDisplayed();
    }

    @Step
    public void verifyGetStartedBtn(){
        getStartedPage.isGetStartedBtnDisplayed();
        getStartedPage.clickSkipButton();
    }
    @Step
    public void allowLocationServiceSetUp() {
        reportWaitTimesPage.isReportWaitTimesPageDisplayed();
        reportWaitTimesPage.clickYesPlease();
        reportWaitTimesPage.allowLocationServices();
    }
    @Step
    public void agreeToTerms(){
        termsOfServicePage.isTermsPageDisplayed();
        termsOfServicePage.clickAgreeButton();
    }

    @Step
    public void startSetupProcess() {
        getNotifiedPage.isGetNotifiedPageDisplayed();
        getNotifiedPage.clickNext();
    }
    @Step
    public void verifyMyAirportsPageOnAndroid() {
        myAirportsPage.verifyCorrectHeaderIsDisplayedAndroid("My Airports");
    }

    @Step
    public void verifyMyAirportsPageOnIos() {
        myAirportsPage.verifyCorrectHeaderIsDisplayediOS();
    }

    @Step
    public void checkPagesForCorrectnessAndroid() {
        myAirportsPage.verifyAllExpectedTabsAreDisplayed();
    }

    @Step
    public void checkPagesForCorrectnessIOS() {
        myAirportsPage.verifyAllExpectedTabsAreDisplayed();
    }

    @Step
    public void agreeToTermsAndNotification() {
        termsOfServicePage.isTermsPageDisplayedIOS();
        termsOfServicePage.clickAgreeButton();
    }
    @Step
    public void viewOnboardingTutorial() {
        getStartedPage.isGetStartedBtnDisplayed();
        getStartedPage.clickGetStarted();
    }
    @Step
    public void swipeAndVerifyPages() {
        getStartedTutorialPage.isOnboardingTutorialDisplayed();
        getStartedTutorialPage.swipeThroughPages("Pack smart","Plan for your trip","Inform fellow travelers");
    }
}
