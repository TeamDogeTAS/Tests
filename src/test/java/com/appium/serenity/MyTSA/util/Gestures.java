package com.appium.serenity.MyTSA.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;


public class Gestures {

    public static void swipe(AppiumDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> swipeObject = new HashMap<String, String>();
        swipeObject.put("direction", "left");
        js.executeScript("mobile: swipe", swipeObject);
    }
}