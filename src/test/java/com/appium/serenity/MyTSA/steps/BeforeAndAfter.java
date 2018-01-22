package com.appium.serenity.MyTSA.steps;

import com.appium.serenity.MyTSA.pages.*;
import io.appium.java_client.AppiumDriver;
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
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "PixelXL");
            caps.setCapability(MobileCapabilityType.APP, "/Users/jaeshin/TSA/IPA for testing/app-Ite-debug.apk");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        } else {
            System.out.println("shit");
        }
        return caps;
    }

    public void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
