package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage
{
    WebDriver driver;
    private By registerPageLink = By.xpath("//a[@href='/register?returnUrl=%2F']");
    private By logInPageLink = By.xpath("//a[@class='ico-login']");
    private By logOutPageLink = By.xpath("//a[@class='ico-logout']");
    private By searchInputField = By.id("small-searchterms");
    private By searchSubmitBtn = By.xpath("//button[@type='submit']");
    private By productDisplayForSearch = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/h2/a");
    private By switchCurrencies = By.xpath("//select[@id='customerCurrency']");
    private By wishListBtn = By.xpath("(//a[@href='/wishlist'])[1]");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void clickRegisterLink()
    {
        driver.findElement(registerPageLink).click();
    }
    public void clickLogInLink()
    {
        driver.findElement(logInPageLink).click();
    }
    public void clickLogOutLink()
    {
        driver.findElement(logOutPageLink).click();
    }
    public void searchForProduct(String searchKey)
    {
        driver.findElement(searchInputField).sendKeys(searchKey);
        driver.findElement(searchSubmitBtn).click();
    }
    public boolean validateIfProductsDisplayAfterSearch()
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(productDisplayForSearch));
        return driver.findElement(productDisplayForSearch).getText().contains("Apple");
    }

}
