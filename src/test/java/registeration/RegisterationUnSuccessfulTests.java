package registeration;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterationPage;

public class RegisterationUnSuccessfulTests extends BaseTests
{
    @Test
    public void registerationUnSuccessfulTests() throws Exception
    {
        HomePage homePage = new HomePage(BaseTests.driver);
        homePage.clickRegisterLink();
        RegisterationPage registerationPage = new RegisterationPage(BaseTests.driver);
        registerationPage.selectGender();
        registerationPage.setFirstNameField("Engy");
        registerationPage.setLastNameField("Ashraf");
        registerationPage.selectDayField();
        registerationPage.selectMonthField();
        registerationPage.selectYearField();
        Thread.sleep(1000);
        registerationPage.setEmailField("egy2296@gmail.com");
        registerationPage.setCompanyField("halan");
        registerationPage.selectNewsletter();
        registerationPage.setPassword("123456");
        registerationPage.setConfirmPasswordField("123456");
        Thread.sleep(1000);
        registerationPage.clickRegisterButton();
        Thread.sleep(5000);
        Assert.assertEquals (registerationPage.getErrorMsg(),"The specified email already exists");

    }

}
