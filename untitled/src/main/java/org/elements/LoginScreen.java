package org.elements;

import org.driver.WebdriverInitialiser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScreen {
    WebdriverInitialiser webdriverInitialiser;
    WebDriver driver;
    LoginScreen(){
        webdriverInitialiser.inintDriver();

    }
    WebElement emailElement = (WebElement) By.id("email");
    WebElement passwordElement = (WebElement) By.id("pass");

    public void enterUsername(String email){

    }

}
