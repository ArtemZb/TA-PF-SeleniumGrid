package tests;

import org.testng.annotations.Test;
import pages.BasePage;

import static org.testng.Assert.assertTrue;

public class RestorePasswordTests extends BaseTest {

    @Test
    public void checkMainComponentsOnRestorePasswordPage(){
        getHeaderPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHeaderPage().waitVisibilityOfElement(getHeaderPage().getSelectStoreLocationPopupVisible(),DEFAULT_WAITING_TIME);
        getHeaderPage().clickCloseSelectStoreLocationPopupButton();
        getHeaderPage().clickSignInButton();
        getHeaderPage().clickRestorePasswordButton();
        getRestorePasswordPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getRestorePasswordPage().isUserLoginFieldVisible();
        getRestorePasswordPage().isSubmitButtonVisible();
        assertTrue(getRestorePasswordPage().isUserLoginFieldActiveByDefault(getDriver()));
    }
}
