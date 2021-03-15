package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.EventListener;

public class HeaderPage extends BasePage {

    @FindBy(xpath = "//div[(@class='epicentrk-1yvcCXijant2')]")
    private WebElement selectStoreLocationPopup;

    @FindBy(xpath = "//span[@class='epicentrk-1SjTFcCUtVa0']")
    private WebElement closeSelectStoreLocationPopupButton;

    @FindBy(xpath ="//div[@class='header__login']")
    private WebElement signInButton;

    @FindBy(xpath = "//form[contains(@id,'auth')]//button[@type='submit']")
    private WebElement singInButton;

    @FindBy(xpath = "//form[contains(@id,'auth')]//a[contains(@href,'login')]")
    private WebElement registerButton;

    @FindBy(xpath = "//form[contains(@id,'auth')]//a[contains(@href,'restore')]")
    private WebElement restorePasswordButton;

    @FindBy(id = "user_login")
    private WebElement userLoginField; // userLogin can be either Email or Phone number

    @FindBy(id = "user_pass")
    private WebElement passwordField;

    @FindBy(xpath = "//div[contains(@class,'search')]//input")
    private WebElement searchField;

    @FindBy(xpath = "//div[contains(@class,'search')]//button")
    private WebElement searchButton;

    @FindBy(xpath = "//span[contains(@class,'counter')]")
    private WebElement compareProductsCount;

    @FindBy(xpath = "//div[@class='header__menu-opener-button']" )
    private WebElement productCatalogue;

    @FindBy(xpath = "//div[contains(@class,'level-1')]//a[contains(@href,'elektronika')]")
    private WebElement elektronikaList;

    public HeaderPage(WebDriver driver){
        super(driver);
    }

    public WebElement getSelectStoreLocationPopupVisible(){
        return selectStoreLocationPopup;
    }

    public void clickCloseSelectStoreLocationPopupButton(){
        closeSelectStoreLocationPopupButton.click();
    }

    public void isSignInButtonVisible() {
        signInButton.isDisplayed();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void isRegisterButtonVisible() {
        registerButton.isDisplayed();
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public boolean isUserLoginFieldVisible() {
        return userLoginField.isDisplayed();
    }

    public boolean isPasswordFieldVisible() {
        return passwordField.isDisplayed();
    }

    public void clickRestorePasswordButton(){
        restorePasswordButton.click();
    }

    public WebElement getCompareProductsCount(){
        return compareProductsCount;
    }

    public String getCompareProductsCountText(){
        return compareProductsCount.getText();
    }

    public void isSearchFieldVisible() {
        searchField.isDisplayed();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickProductCatalogue(){
        productCatalogue.click();
    }

    public void clickElektronikaList(){
        elektronikaList.click();
    }

}
