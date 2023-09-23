package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AddProductPage
{

    private WebDriver driver;
    private By nameAr = By.id("productForm_name_ar");
    private By descriptionAr = By.id("productForm_description_ar");
    private By nameEn = By.id("productForm_name_en");
    private By descriptionEn = By.id("productForm_description_en");
    private By merchantId = By.id("productForm_merchant_id");
    private By color = By.xpath("/html/body/div[1]/section/section/main/div/form/div[2]/div/div[5]/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div/span[2]");
    private By selectedcolor = By.xpath("//div[@label='[object Object]' and @class='ant-select-item ant-select-item-option']//div//div//div");
    private By images = By.id("productForm_images");
    private By category = By.xpath("/html/body/div[1]/section/section/main/div/form/div[4]/div/div[1]/div[1]/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div");
    private By selectedCategory=By.xpath("//div[@label='OPPO']");
    private By sections = By.id("productForm_sections");
    private By searchTagsAr = By.id("productForm_tag_ar");
    private By searchTagsEn = By.id("productForm_tag_en");
    private By brand = By.id("productForm_brand");
    private By originalPrice= By.id("productForm_original_price");
    private By discount = By.id("productForm_discount");
    private By stockQuantity = By.id("productForm_stock");
    private By submitButton = By.xpath("/html/body/div[1]/section/section/main/div/form/div[6]/button[2]");

    public AddProductPage (WebDriver driver){
        this.driver=driver;
    }

    public void setNameAr(String arabic_name){
        driver.findElement(nameAr).sendKeys(arabic_name);
    }
    public void setDescriptionAr(String arabic_description){
        driver.findElement(descriptionAr).sendKeys(arabic_description);
    }
    public void setNameEn(String arabic_name){
        driver.findElement(nameEn).sendKeys(arabic_name);
    }
    public void setDescriptionEn(String english_description){
        driver.findElement(descriptionEn).sendKeys(english_description);
    }
    public void setmerchantId(String merchant_ID){
    driver.findElement(merchantId).sendKeys(merchant_ID);
    }

    public void selectedColor() throws InterruptedException
    {
        WebElement colors = driver.findElement(color);
        colors.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectedcolor));
        WebElement element = driver.findElement(selectedcolor);
        System.out.println(element.getText());
        element.click();
    }

    public void setImages()
    {
        WebElement addFile = driver.findElement(images);
        addFile.sendKeys("/home/engy/Desktop/test.jpg");
    }
    public void setCategory() throws InterruptedException
    {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(500));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(category));
        WebElement categoryy = driver.findElement(category);
        categoryy.click();
        WebElement element = driver.findElement(selectedCategory);
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait2.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void setSections(){
        WebElement sec= driver.findElement(sections);
        sec.click();

    }
    public void setSearchTagsAr(String tagsAr){
       WebElement tag= driver.findElement(searchTagsAr);
       tag.sendKeys(tagsAr);
       tag.sendKeys(Keys.ENTER);
    }
    public void setSearchTagsEn(String tagsEn){
        WebElement tag=driver.findElement(searchTagsEn);
        tag.sendKeys(tagsEn);
        tag.sendKeys(Keys.ENTER);
    }
    public void setbrand(String brandd){
        driver.findElement(brand).sendKeys(brandd);
    }
    public void setOriginalPrice(String original_price ){
        driver.findElement(originalPrice).sendKeys(original_price);
    }
    public void setDiscount(String discountt){
        driver.findElement(discount).sendKeys(discountt);
    }
    public void setstockQuantity(String quantity){
        driver.findElement(stockQuantity).sendKeys(quantity);
    }

}
