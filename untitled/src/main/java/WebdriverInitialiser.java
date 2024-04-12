import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverInitialiser {
    WebDriver driver;

    public void inintDriver(){
        driver = new ChromeDriver();
        driver.get("www.facebook.com");
    }

    public void closeDriver(){
        driver.close();

    }

    public void quitSession(){
        driver.quit();
    }

}
