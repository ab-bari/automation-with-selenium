import Utilities.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test()
public class BaseTest {

    Browser browser = new Browser();


    @BeforeSuite(alwaysRun = true)
    public void testSuiteSetup(){
        browser.openChromeBrowser();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown(){
        browser.closeBrowser();
    }

    @AfterMethod(alwaysRun = true)
    public void validateWaitForFewSeconds(){
        System.out.println("Waiting for 5 seconds");
        browser.sleep(5);
    }
}
