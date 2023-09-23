package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginSuccessfulTests extends BaseTests
{

    @Test
    public void loginSuccessfulTests() throws Exception
    {
        LoginPage loginPage = new LoginPage(BaseTests.driver);
        loginPage.clickLoginLink();
        loginPage.setEmailField("egy296@gmail.com");
        loginPage.setPasswordField("123456");
        loginPage.selectRememberMeField();
        Thread.sleep(1000);
        loginPage.clickLoginButton();
    }
}
