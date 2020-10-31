package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loading7page {

    public Loading7page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Loacate "Done!"  message
    @FindBy(id = "alert")
    public WebElement doneMessage;

}
