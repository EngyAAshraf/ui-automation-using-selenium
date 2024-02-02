package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterationPage
{
    WebDriver driver;
    private By genderField = By.id("gender-female");
    private By firstNameField = By.id("FirstName");
    private By lastNameField = By.id("LastName");
    private By emailField = By.id("Email");
    private By companyField = By.id("Company");
    private By newsletterSelected = By.name("Newsletter");
    private By passwordField = By.id("Password");
    private By confirmPasswordField = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");
    private By continueButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a");
    private By successMsg = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]");
    private By errorMsg = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li");


    public RegisterationPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void selectGender()
    {
        driver.findElement(genderField).click();
    }
    public void setFirstNameField(String firstName)
    {
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void setLastNameField(String lastName)
    {
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    public void selectDayField()
    {
        WebElement selectElement = driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(selectElement);
        select.selectByValue("27");
    }
    public void selectMonthField()
    {
        WebElement selectElement = driver.findElement(By.name("DateOfBirthMonth"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("August");
    }
    public void selectYearField()
    {
        WebElement selectElement = driver.findElement(By.name("DateOfBirthYear"));
        Select select = new Select(selectElement);
        select.selectByValue("1999");
    }
    public void setEmailField(String email)
    {
    driver.findElement(emailField).sendKeys(email);
    }
    public void setCompanyField(String company)
    {
        driver.findElement(companyField).sendKeys(company);
    }
    public void selectNewsletter()
    {
        driver.findElement(newsletterSelected).click();
    }
    public void setPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void setConfirmPasswordField(String password)
    {
        driver.findElement(confirmPasswordField).sendKeys(password);
    }

    public void clickRegisterButton()
    {
        driver.findElement(registerButton).click();
    }
    public void clickContinueButton()
    {
        driver.findElement(continueButton).click();
    }
    public String getSuccessMsg()
    {
        WebElement msgLocation = driver.findElement(successMsg);
        String msg = msgLocation.getText();
        return msg;
    }
    public String getErrorMsg()
    {
        WebElement msgLocation = driver.findElement(errorMsg);
        String msg = msgLocation.getText();
        return msg;
    }
}
