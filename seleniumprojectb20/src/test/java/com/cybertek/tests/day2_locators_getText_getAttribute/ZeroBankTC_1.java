package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTC_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        String actualTitle =  driver.getTitle();
        String expectedTitle = "Zero - Log in";
        if(actualTitle.equals(expectedTitle) ) {
            System.out.println("Title verification PASSED!!!");
        } else {
            System.out.println("Title verification Failed!!!");
        }
        System.out.println(actualTitle);
    }
}
