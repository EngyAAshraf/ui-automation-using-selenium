package products;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import static util.GenericMethods.capturescreenshot;

public class SearchForProductTests extends BaseTests
{
    @Test
    public void searchForProduct() throws Exception
    {
        HomePage homePage= new HomePage(BaseTests.driver);
        homePage.searchForProduct("Apple MacBook Pro 13-inch");
        capturescreenshot(driver, "SearchForProduct");
        Assert.assertTrue(new HomePage(driver).validateIfProductsDisplayAfterSearch());
    }
}
