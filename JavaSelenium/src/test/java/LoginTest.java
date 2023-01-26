import Pages.LoginPage;
import org.testng.annotations.Test;

@Test()
public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyNavigationToLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @Test
    public void verifySuccessfulLogin() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickOnLoginButton();
    }

}
