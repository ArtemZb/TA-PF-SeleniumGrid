package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HeaderTests extends BaseTest {

    @Test
    public void checkUserSignInPopUp(){
        getHeaderPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHeaderPage().waitVisibilityOfElement(getHeaderPage().getSelectStoreLocationPopupVisible(),DEFAULT_WAITING_TIME);
        getHeaderPage().clickCloseSelectStoreLocationPopupButton();
        getHeaderPage().clickSignInButton();
        getHeaderPage().isRegisterButtonVisible();
        getHeaderPage().isSignInButtonVisible();
        assertTrue(getHeaderPage().isUserLoginFieldVisible());
        assertTrue(getHeaderPage().isPasswordFieldVisible());
    }

    @Test
    public void checkCompareList() throws InterruptedException {
        getHeaderPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHeaderPage().waitVisibilityOfElement(getHeaderPage().getSelectStoreLocationPopupVisible(),DEFAULT_WAITING_TIME);
        getHeaderPage().clickCloseSelectStoreLocationPopupButton();
        getHeaderPage().isSearchFieldVisible();
        getHeaderPage().enterTextToSearchField("cable");
        getHeaderPage().clickSearchButton();
        getSearchResultsPage().waitVisibilityOfElement(getSearchResultsPage().getProductsList(),DEFAULT_WAITING_TIME);
        getSearchResultsPage().clickCompareItemsOnProducts();
        getHeaderPage().waitVisibilityOfElement(getHeaderPage().getCompareProductsCount(), DEFAULT_WAITING_TIME);
        assertEquals(getHeaderPage().getCompareProductsCountText(), "1");
    }



}
