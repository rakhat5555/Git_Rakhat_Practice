package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_3_Facebook_Header_Verification {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(" https://www.facebook.com");
        String actualHeader = driver.findElement(By.tagName("h2")).getText();
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        System.out.println(actualHeader);
        if(actualHeader.equalsIgnoreCase(expectedHeader)) {
            System.out.println("Header verification Passed!!!");
        } else {
            System.out.println("Header verification Failed!!!");
        }
    }
}
