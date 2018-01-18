package com.appium.serenity.MyTSA.test;

import com.appium.serenity.MyTSA.testpages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class testclass {

    private static AppiumDriver driver;
    private PreliminaryUpdateCheckPagetest prelimPage1;
    private GetStartedPagetest getStartedPage1;
    private GetNotifiedPagetest getNotifiedPage1;
    private TermsOfServicePagetest termsPage1;
    private ReportWaitTimesPagetest reportPage1;

    @Before
    public void DesiredCapabilities() throws MalformedURLException {
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";

        URL url = new URL(URL_STRING);

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "PixelXL");
        caps.setCapability(MobileCapabilityType.APP, "/Users/jaeshin/TSA/IPA for testing/app-Ite-debug.apk");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");

        driver = new AppiumDriver(url, caps);
        prelimPage1 = new PreliminaryUpdateCheckPagetest(driver);
        getStartedPage1 = new GetStartedPagetest(driver);
        getNotifiedPage1 = new GetNotifiedPagetest(driver);
        termsPage1 = new TermsOfServicePagetest(driver);
        reportPage1 = new ReportWaitTimesPagetest(driver);
    }

    @Test
    public void theTest(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        prelimPage1.isUpdateCheckPageDisplayed();

        getStartedPage1.getstartedrdy();
        getStartedPage1.getstartedaction();

        getNotifiedPage1.getnotifiedrdy();
        getNotifiedPage1.getnotifiedaction();

        reportPage1.reportpagerdy();
        reportPage1.reportpageaction();

        termsPage1.termspagerdy();
        termsPage1.termspageaction();
    }


    @After
    public void tearDownAppium() throws Exception {
        System.out.println("\nTearing Down Driver.");
        driver.quit();
    }
}
