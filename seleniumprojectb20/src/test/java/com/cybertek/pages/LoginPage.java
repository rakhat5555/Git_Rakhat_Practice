package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

//        @FindBy(id = "ctl00_MainContent_username")
//        public WebElement usernameInput;
    }
}
