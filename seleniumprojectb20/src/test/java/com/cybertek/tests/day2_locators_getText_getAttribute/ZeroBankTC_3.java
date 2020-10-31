package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTC_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.name("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password" + Keys.ENTER);
        Thread.sleep(5000);
        String actualTitle =  driver.getTitle();
        String expectedTitle = "Zero - Account Summary";
        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification Passed!!!");
        } else {
            System.out.println("Title verification Failed!!!");
        }
        System.out.println(actualTitle);

    }
}
