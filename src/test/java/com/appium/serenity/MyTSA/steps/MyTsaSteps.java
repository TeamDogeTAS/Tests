package com.appium.serenity.MyTSA.steps;


import com.appium.serenity.MyTSA.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyTsaSteps extends ScenarioSteps{

    PreliminaryUpdateCheckPage preliminaryUpdateCheckPage;
    GetStartedPage getStartedPage;
    ReportWaitTimesPage reportWaitTimesPage;
    GetNotifiedPage getNotifiedPage;
    TermsOfServicePage termsOfServicePage;
    MyAirportsPage myAirportsPage;

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
        termsOfServicePage.isTermsPageDisplayed();
        termsOfServicePage.clickAgreeButton();
    }
    @Step
    public void startSetupProcess() {
        getNotifiedPage.isGetNotifiedPageDisplayed();
        getNotifiedPage.clickNext();
    }
    @Step
    public void verifyMyAirportsPage() {
        myAirportsPage.verifyCorrectHeaderIsDisplayed("My Airports");
    }
    @Step
    public void checkPagesForCorrectness() {
        myAirportsPage.verifyAllExpectedTabsAreDisplayed();
    }
}
