package com.appium.serenity.MyTSA.steps;

import com.appium.serenity.MyTSA.pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BeforeAndAfter {

    protected static AppiumDriver driver;

    public void startUp(String os) throws Exception{
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities(os));
    }

    public DesiredCapabilities capabilities(String os) {

        DesiredCapabilities caps = new DesiredCapabilities();

        if (os.equalsIgnoreCase("android")) {
            caps.setCapability(AndroidMobileCapabilityType.AVD, "PixelXL");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "PixelXL");
            caps.setCapability(MobileCapabilityType.APP, "/Users/jaeshin/TSA/mytsa-android/app/build/outputs/apk/Ite/debug/app-Ite-debug.apk");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        } else {
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITEST");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
            caps.setCapability(MobileCapabilityType.APP, "/Users/jaeshin/TSA/IPA for testing/MyTSA.app");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2");
        }
        return caps;
    }

    public void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
