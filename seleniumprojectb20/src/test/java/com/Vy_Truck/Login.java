package com.Vy_Truck;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("user151");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER) ;
        Thread.sleep(2000);
        driver.findElement(By.className("unclickable")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[4]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]")).click();
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Henry Winston - Vehicle Odometer - Entities - System - Car - Entities - System";

        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Vehicle information's title verification Passed!!!");
        } else {
            System.out.println("Vehicle information's title verification Failed!!!");
        }

    }
}
