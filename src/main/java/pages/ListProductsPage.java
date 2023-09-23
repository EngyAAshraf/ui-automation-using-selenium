package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListProductsPage
{

    private WebDriver driver;
    private By productLink = By.xpath("/html/body/div[1]/div/section/aside/div/ul/li[1]/span[2]");
    private By addProductButton = By.xpath("/html/body/div[1]/div/section/section/main/div/section/div[1]/div[2]/button[1]");
    private By addSingleProductbutton = By.xpath("/html/body/div[1]/div/section/section/main/div/div/div/div[1]/div[1]");

    public ListProductsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public ListProductsPage clickProductLink()
    {
        driver.findElement(productLink).click();
        return new ListProductsPage(driver);
    }

    public ListProductsPage clickAddProductButton()
    {
        driver.findElement(addProductButton).click();
        return new ListProductsPage(driver);

    }

    public ListProductsPage clickAddSingleProductButton()
    {
        driver.findElement(addSingleProductbutton).click();
        return new ListProductsPage(driver);

    }


}
