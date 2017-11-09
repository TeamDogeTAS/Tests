package com.appium.serenity.MyTSA.runners;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "/Users/jaeshin/Test Automation/AutomationTest/src/test/resources/features/MyTSASmokeTest.feature",
                    glue = "com.appium.serenity.MyTSA.cucumber")
public class MyTSASmokeTest {

    @Managed
    public WebDriver driver;
}
