package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage
{
    WebDriver driver;
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By rememberMeSelected = By.id("RememberMe");
    private By loginLink = By.className("ico-login");
    private By loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    private By errorMsg = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]");


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickLoginLink()
    {
        driver.findElement(loginLink).click();
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
