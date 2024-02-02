package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage
{
    WebDriver driver;
    private By AddToCartBTN= By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]");
    private By AddToCartBTNN= By.id("add-to-cart-button-4");
    private By AddingSuccessfulMsg= By.xpath("//p[@class=\"content\"]");

    public ProductPage(WebDriver driver){
        this.driver =driver;
    }

    public void clickAddToCartBTN()
    {
        driver.findElement(AddToCartBTN).click();
    }
    public void clickAddToCartBTNN()
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddToCartBTNN));
        driver.findElement(AddToCartBTNN).click();
    }
    public ExpectedCondition<WebElement> validateIfAddingProductSuccessfully()
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddingSuccessfulMsg));
        return ExpectedConditions.visibilityOfElementLocated(AddingSuccessfulMsg);
    }
}
