package com.cybertek.tests.day5_TestNG_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Introduction {
    @BeforeClass
    public void setUpClass() {
        System.out.println("Before class is running...");
    }
    @AfterClass
    public void tearDownClass() {
        System.out.println("After class is running...");
    }
    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Before method is running...");
    }
    @AfterMethod
    public void tearDownMethod() {
        System.out.println("After method is running...");
    }
    @Test
    public void btest1() {
        System.out.println("Test1 is running...");
    }
    @Test
    public void atest2() {
        System.out.println("Test 2 is running...");
    }
    @Test
    public void test3() {
        String str1 = "TestNG";
        String str2 = "TestNG";
        String str3 = "asdffa";

        Assert.assertTrue(str1.equals(str2));
        Assert.assertTrue(str1.equals(str3) , "Str1 is not equal to str3");

        Assert.assertEquals(str1, str2, "failure message str1 is not equals to str2");
    }

}
