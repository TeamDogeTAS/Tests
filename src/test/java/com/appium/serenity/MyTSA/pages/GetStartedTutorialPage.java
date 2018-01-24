package com.appium.serenity.MyTSA.pages;

import com.appium.serenity.MyTSA.util.Gestures;
import com.appium.serenity.MyTSA.util.Waits;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class GetStartedTutorialPage extends PageObject {

    public AppiumDriver driver;
    Gestures gestures;

    public GetStartedTutorialPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    @iOSFindBy(accessibility = "Pack smart")
    private MobileElement packSmartTitle;

    @iOSFindBy(accessibility = "Plan for your trip")
    private MobileElement planTitle;

    @iOSFindBy(accessibility = "Inform fellow travelers")
    private MobileElement informTitle;


    public void swipeThroughPages(String page0, String page1, String page2) {
        String pageTitles[] ={page0, page1, page2};
        MobileElement titles[] = {packSmartTitle, planTitle, informTitle};
        for(int i = 0; i <titles.length-1; i++){
            assertThat(titles[i].getText().equalsIgnoreCase(pageTitles[i]));
            gestures.swipe(driver);
        }
    }

    public void isOnboardingTutorialDisplayed() {
        Waits.waitForElement(packSmartTitle);
    }
}
