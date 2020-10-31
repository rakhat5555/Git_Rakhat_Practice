package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTC_2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        String actualLinkText = driver.findElement(By.className("brand")).getText();
        String expectedLinkText = "Zero Bank";
        if(actualLinkText.equals(expectedLinkText)) {
            System.out.println("Link text verification Passed!!!");
        } else {
            System.out.println("Link text verification Failed!!! ");
        }
        String actualLinkHref = driver.findElement(By.tagName("a")).getAttribute("href");
        String expectedLinkHref = "index.html";
        if(actualLinkHref.contains(expectedLinkHref)) {
            System.out.println("Link href verification Passed!!!");
        } else {
            System.out.println("Link href verification Failed!!!");
        }
    }
}
