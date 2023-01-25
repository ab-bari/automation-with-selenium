import Utilities.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test()
public class BaseTest {

    Browser browser = new Browser();
    String swagLabURL = "https://www.saucedemo.com";


    @BeforeSuite(alwaysRun = true)
    public void testSuiteSetup(){
        browser.openChromeBrowser();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown(){
        browser.closeBrowser();
    }
    @Test
    public void validateHelloWorld(){
        String testString = "Hello World!";
        Assert.assertEquals(testString, "Hello World", "Test string did not match.");
        System.out.println("Test Hello World passed successfully.");
    }

    @Test
    public void validateNavigationToSwagLab(){
        browser.goToURL(swagLabURL);
        browser.sleep(2000);
    }
}
