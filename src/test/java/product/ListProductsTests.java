package product;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ListProductsPage;

public class ListProductsTests
{
    @Test
    public void listProductsTest() throws Exception
    {

        ListProductsPage listProductsPage = new ListProductsPage(BaseTests.driver);
        listProductsPage.clickProductLink();
        listProductsPage.clickAddProductButton();
        listProductsPage.clickAddSingleProductButton();

    }
}
