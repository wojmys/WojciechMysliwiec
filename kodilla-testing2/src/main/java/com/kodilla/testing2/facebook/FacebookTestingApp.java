package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String COOKIE_ACCEPT = "//button[contains(@data-cookiebanner, \"accept_button\")]";
    public static final String CREATE_ACCOUNT = "//a[contains(@data-testid, \"open-registration-form-button\")]";
    public static final String DATE_DAY = "//select[contains(@id, \"day\")]";
    public static final String DATE_MONTH  ="//select[contains(@id,\"month\")]";
    public static final String DATE_YEAR ="//select[contains(@id,\"year\")]";
    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(COOKIE_ACCEPT)).click();
        driver.findElement(By.xpath(CREATE_ACCOUNT)).click();

        while (!driver.findElement(By.id("day")).isDisplayed()) ;

        WebElement day = driver.findElement(By.xpath(DATE_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByValue("6");

        WebElement month = driver.findElement(By.xpath(DATE_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("1");

        WebElement year = driver.findElement(By.xpath(DATE_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByValue("2021");
    }
}
