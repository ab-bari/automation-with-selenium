package Pages;

import Utilities.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class BasePage {

    public static int defaultTimeOut = 5;

    public void setValueIntoTextField(By locator, String username) {
        WebElement element = getElement(locator);
        element.clear();
        element.sendKeys(username);
    }

    public void click(By locator) {
        getElement(locator).click();
    }

    public void testStepFailed(String failMessage) {
        System.out.println(failMessage);
        Assert.fail(failMessage);
    }

    public void testStepPassed(String passMessage) {
        System.out.println(passMessage);
    }

    public void testStepSkip(String skipMessage) {
        System.out.println(skipMessage);
    }

    public String getMethodName() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        return stackTrace[1].getMethodName();
    }

    protected boolean isElementPresent(By locator) {
        try {
            Browser.getWait(defaultTimeOut).until(ExpectedConditions.presenceOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    protected boolean isElementVisible(By locator) {
        try {
            Browser.getWait(defaultTimeOut).until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    protected WebElement getElement(By locator) {
        return Browser.getWait(defaultTimeOut).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected String getText(By locator) {
        return getElement(locator).getText();
    }

}
