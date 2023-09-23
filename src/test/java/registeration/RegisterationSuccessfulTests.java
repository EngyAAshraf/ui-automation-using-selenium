package registeration;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterationPage;

public class RegisterationSuccessfulTests extends BaseTests
{
    @Test
    public void registerationSuccessfulTests() throws Exception
    {

        RegisterationPage registerationPage = new RegisterationPage(BaseTests.driver);
        registerationPage.clickRegisterLink();
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
        Assert.assertEquals (registerationPage.getSuccessMsg(),"Your registration completed");
        Thread.sleep(3000);
        registerationPage.clickContinueButton();

    }
}
