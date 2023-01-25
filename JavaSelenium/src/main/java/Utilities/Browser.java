package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public static WebDriver driver;

    public void openChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void goToURL(String url) {
        driver.get(url);
    }

    public void closeBrowser(){
        driver.quit();
    }

    public void sleep(int timeOut){
        try {
            Thread.sleep(timeOut);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
