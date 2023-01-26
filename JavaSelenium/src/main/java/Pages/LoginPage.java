package Pages;

import Utilities.Browser;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    //[Start]: Login Page locators
    By usernameTextFieldLocator = By.id("user-name");
    By passwordFieldLocator = By.id("password");
    By loginButtonLocator = By.id("login-button");
    By loginErrorMessageLocator = By.xpath("//h3[@data-test='error']");
    //[End]: Login Page locators

    String swagLabURL = "https://www.saucedemo.com";

    //[Start]: Login Page methods

    public void navigateToLoginPage() {
        try {
            browser.goToURL(swagLabURL);
            testStepPassed("Successfully navigated to SWAG LABS login page");
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed to Set Username. Error Message: " + e.getMessage());
        }
    }

    public void setUsername(String username) {
        try {
            setValueIntoTextField(usernameTextFieldLocator, username);
            testStepPassed("Successfully Set Username: " + username);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed to Set Username. Error Message: " + e.getMessage());
        }
    }

    public void setPassword(String password) {
        try {
            setValueIntoTextField(passwordFieldLocator, password);
            testStepPassed("Successfully Set Password: " + password);
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed to Set Password. Error Message: " + e.getMessage());
        }
    }

    public void clickOnLoginButton() {
        try {
            click(loginButtonLocator);
            testStepPassed("Successfully Clicked On Login Button");
        } catch (Exception e) {
            e.printStackTrace();
            testStepFailed("Failed to click on login button. Error Message: " + e.getMessage());
        }
    }

    public String GetLoginErrorMessage() {
        String errorMessage = null;
        try {
            errorMessage = getText(loginErrorMessageLocator);
            testStepPassed("Successfully get login error message: " + errorMessage);
        } catch (Exception e) {
            errorMessage = e.getMessage();
            testStepFailed("Failed to get login error message. Error Message: " + errorMessage);
        }
        return errorMessage;
    }
}
