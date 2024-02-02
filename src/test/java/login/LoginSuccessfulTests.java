package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginSuccessfulTests extends BaseTests
{
    @Test
    public void loginSuccessfulTests() throws Exception
    {
        HomePage homePage = new HomePage(BaseTests.driver);
        homePage.clickLogInLink();
        LoginPage loginPage = new LoginPage(BaseTests.driver);
        loginPage.setEmailField("egy2296@gmail.com");
        loginPage.setPasswordField("123456");
        loginPage.selectRememberMeField();
        Thread.sleep(1000);
        loginPage.clickLoginButton();
        homePage.clickLogOutLink();

    }
}
