package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {

    public static final String FIREFOX = "FIREFOX_DRIVER";
    public static final String EDGE = "EDGE_DRIVER";

    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.gecko.driver", "c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver", "c:\\Selenium-drivers\\Edge\\msedgedriver.exe");

        if (driver.equals(FIREFOX)) {
            return new FirefoxDriver();
        } else if (driver.equals(EDGE)) {
            return new EdgeDriver();
        } else {
            return null;
        }
    }
}