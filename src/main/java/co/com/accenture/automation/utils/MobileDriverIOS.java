package co.com.accenture.automation.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriverIOS<T> {
    public static WebDriver instance() throws MalformedURLException {
        DesiredCapabilities ability = new DesiredCapabilities();
        ability.setCapability("deviceName", "iPhone 14 Pro Max");
        ability.setCapability("platformName", "iOS");
        ability.setCapability("platformVersion", "16.4");
        ability.setCapability("noReset", "false");
        ability.setCapability("udid", "00FF8987-6C78-48D9-9CFF-E14A930A31A0");
        ability.setCapability("app", "/Users/sebastian.ramirez/Downloads/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.app");
        ability.setCapability("appium:automationName", "XCUITest");
        return new AppiumDriver(new URL("http://0.0.0.0:4723/"), ability);
    }
}