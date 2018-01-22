package com.appium.serenity.MyTSA.steps;


import com.appium.serenity.MyTSA.pages.*;
import com.appium.serenity.MyTSA.testpages.PreliminaryUpdateCheckPagetest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static com.appium.serenity.MyTSA.steps.BeforeAndAfter.driver;
import static java.util.concurrent.TimeUnit.SECONDS;

public class MyTsaSteps extends ScenarioSteps{

    PreliminaryUpdateCheckPage preliminaryUpdateCheckPage;
    GetStartedPage getStartedPage;
    ReportWaitTimesPage reportWaitTimesPage;
    GetNotifiedPage getNotifiedPage;
    TermsOfServicePage termsOfServicePage;
    MyAirportsPage myAirportsPage;

    @Step
    public void setUp() {
        preliminaryUpdateCheckPage = new PreliminaryUpdateCheckPage(driver);
        getStartedPage = new GetStartedPage(driver);
        reportWaitTimesPage = new ReportWaitTimesPage(driver);
        getNotifiedPage = new GetNotifiedPage(driver);
        termsOfServicePage = new TermsOfServicePage(driver);
        myAirportsPage = new MyAirportsPage(driver);
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
    public void checkPagesForCorrectness() {
        myAirportsPage.verifyAllExpectedTabsAreDisplayed();
    }
}
