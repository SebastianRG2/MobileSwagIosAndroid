package co.com.accenture.automation.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriver<T> {
    public static WebDriver instance() throws MalformedURLException {
        DesiredCapabilities ability = new DesiredCapabilities();
        ability.setCapability("deviceName", "R58T20G2DHK");
        ability.setCapability("platformName", "Android");
        ability.setCapability("platformVersion", "13");
        ability.setCapability("appPackage", "com.swaglabsmobileapp");
        ability.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
        ability.setCapability("automationName", "uiautomator2");
        ability.setCapability("noReset", "false");
        return new AppiumDriver(new URL("http://0.0.0.0:4723/"), ability);
    }
}