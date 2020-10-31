package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankHeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        String actualHeaderText = driver.findElement(By.tagName("h3")).getText();
        String expectedHeaderText = "Log in to ZeroBank";
        if(actualHeaderText.equalsIgnoreCase(expectedHeaderText)) {
            System.out.println("Header verification passed!!!");
        } else {
            System.out.println("Header verification failed!!!");
        }
    }
}
