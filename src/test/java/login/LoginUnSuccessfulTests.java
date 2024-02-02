package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginUnSuccessfulTests
{
    @Test
    public void loginUnSuccessfulTests() throws Exception
    {
        HomePage homePage = new HomePage(BaseTests.driver);
        homePage.clickLogInLink();
        LoginPage loginPage = new LoginPage(BaseTests.driver);
        loginPage.setEmailField("emy296@gmail.com");
        loginPage.setPasswordField("123456");
        loginPage.selectRememberMeField();
        Thread.sleep(1000);
        loginPage.clickLoginButton();
        Assert.assertEquals (loginPage.getErrorMsg(),"Login was unsuccessful. Please correct the errors and try again."+"\n" +
                "No customer account found");

    }
}
