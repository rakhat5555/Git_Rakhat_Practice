package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_4_Facebook_HeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String actualLnHREF = driver.findElement(By.className("_8esh")).getAttribute("href");
        String expectedLnHREF = "registration_form";
        System.out.println(actualLnHREF);
        if(actualLnHREF.contains(expectedLnHREF)) {
            System.out.println("Header verification passed!");
        } else {
            System.out.println("Header verification Failed!!!");
        }
    }
}
