package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {
    static WebDriver driver;

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

    public static WebDriverWait getWait(int timeOut) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeOut));
    }

    public static WebDriverWait getWait() {
        return getWait(10);
    }

    public static WebDriver getDriver() {
        return driver;
    }


    public void sleep(int timeOut){
        try {
            Thread.sleep(Duration.ofSeconds(timeOut));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
