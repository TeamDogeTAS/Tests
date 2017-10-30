package com.appium.serenity.runners;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "/Users/jaeshin/AutomationTest/src/test/resources/features/MyTSATest.feature",
                    glue = "com.appium.serenity.cucumber")
public class MyTSATest {

    @Managed
    public WebDriver driver;
}
