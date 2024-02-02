package products;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ProductPage;

public class AddProductToCartTests extends BaseTests
{
    @Test
    public void addProduct () throws Exception
    {
        ProductPage productPage= new ProductPage(BaseTests.driver);
        productPage.clickAddToCartBTN();
        productPage.clickAddToCartBTNN();
        productPage.validateIfAddingProductSuccessfully();
    }
}
