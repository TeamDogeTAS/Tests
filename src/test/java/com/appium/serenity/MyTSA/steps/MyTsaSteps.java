package com.appium.serenity.MyTSA.steps;


import com.appium.serenity.MyTSA.pages.GetStartedPage;
import com.appium.serenity.MyTSA.pages.PreliminaryUpdateCheckPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTsaSteps extends ScenarioSteps{

    private static Logger LOGGER = LoggerFactory.getLogger(MyTsaSteps.class);

    PreliminaryUpdateCheckPage preliminaryUpdateCheckPage;
    GetStartedPage getStartedPage;

    @Step
    public void verifyUpdateCheckPage(){
        LOGGER.info("Verifying Preliminary Update Check is executing");
        preliminaryUpdateCheckPage.isUpdateCheckPageDisplayed();
    }

    @Step
    public void verifyGetStartedHeader(){
        LOGGER.info("Verifying that Get Started Page is showing");
        getStartedPage.isMyTsaHeaderDisplayed();
    }

    @Step
    public void verifyGetStartedBtn(){
        LOGGER.info("Verifying that Get Started Button is displayed");
        getStartedPage.isGetStartedBtnDisplayed();
    }
}
