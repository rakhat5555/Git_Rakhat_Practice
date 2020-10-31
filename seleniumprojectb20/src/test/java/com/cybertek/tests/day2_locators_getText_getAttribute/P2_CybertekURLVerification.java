package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) {
        //TC #2: Cybertek verifications
        //1. Open Chrome browser
        // I need to setup my browser driver.
        WebDriverManager.chromedriver().setup();

        //
        WebDriver driver = new ChromeDriver();

        // this line will maximize the vewly opened browser page
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        //3. Verify URL contains
        //Expected: cybertekschool

        String expectedInUrl = "cybertekschool";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedInUrl) ) {
            System.out.println("URL verification PASSED!");
        } else {
            System.out.println("URL verification FAILED!!!");
        }

        //4. Verify title:
        //Expected: Practice
        if(driver.getTitle().equals("Practice") ) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed!");
        }
    }
}
