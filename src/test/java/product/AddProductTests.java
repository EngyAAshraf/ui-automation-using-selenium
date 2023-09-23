package product;


import base.BaseTests;
import org.testng.annotations.Test;
import pages.AddProductPage;

public class AddProductTests
{
    @Test
    public void addProductTests() throws Exception
    {
        AddProductPage addProductPage = new AddProductPage(BaseTests.driver);
        addProductPage.setNameAr("برودكت اتوميشن 1 ");
        addProductPage.setDescriptionAr("برودكت اتوميشن 1 برودكت اتوميشن 1برودكت اتوميشن 1 ");
        addProductPage.setNameEn("automation product");
        addProductPage.setDescriptionEn("automation product automation product ");
        addProductPage.setmerchantId("ss21 ");
        addProductPage.selectedColor();
        Thread.sleep(10);
        addProductPage.setImages();
        Thread.sleep(1000);
        addProductPage.setCategory();
//        addProductPage.setSections();

        addProductPage.setSearchTagsAr("ljkghjgfgdgfh");
        addProductPage.setSearchTagsEn("ljkghjgfgdgfh");

//        addProductPage.setImages();

//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Thread.sleep(5000);

        //  driver.switchTo().defaultContent();


    }
}
