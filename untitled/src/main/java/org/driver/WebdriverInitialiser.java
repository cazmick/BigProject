package org.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverInitialiser {
    WebDriver driver;

    public WebDriver inintDriver(){
        driver = new ChromeDriver();
        driver.get("www.facebook.com");
        return driver;
    }

    public void closeDriver(){
        driver.close();

    }

    public void quitSession(){
        driver.quit();
    }

}
