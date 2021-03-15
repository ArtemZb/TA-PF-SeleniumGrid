package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProductsListTests extends BaseTest {

    @Test
    public void checkProductsSortedAscendingPrice(){
        getHeaderPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHeaderPage().waitVisibilityOfElement(getHeaderPage().getSelectStoreLocationPopupVisible(),DEFAULT_WAITING_TIME);
        getHeaderPage().clickCloseSelectStoreLocationPopupButton();
        getHeaderPage().clickProductCatalogue();
        getHeaderPage().implicitWait(DEFAULT_WAITING_TIME);
        getHeaderPage().clickElektronikaList();
        getHeaderPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getProductsListPage().clickCables();
        getHeaderPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getProductsListPage().clickOnSortAscendingPrice();
        getHeaderPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        assertTrue(getProductsListPage().isProductSortedAscendingPrice());
    }
}
