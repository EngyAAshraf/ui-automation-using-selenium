package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.GenericMethods;

public class LoginPage extends GenericMethods
{
    WebDriver driver;
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By rememberMeSelected = By.id("RememberMe");
    private By loginButton = By.xpath("//button[@class=\"button-1 login-button\"]");
    private By errorMsg = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setEmailField(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPasswordField(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void selectRememberMeField()
    {
        driver.findElement(rememberMeSelected).click();
    }


    public void clickLoginButton()
    {
        driver.findElement(loginButton).click();
    }
    public String getErrorMsg()
    {
        WebElement msgLocation = driver.findElement(errorMsg);
        String msg = msgLocation.getText();
        return msg;
    }
}
