package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestorePasswordPage extends BasePage {

    @FindBy(xpath = "//input[contains(@class,'email-validate')]")
    private WebElement userLoginField;

    @FindBy(id="submit")
    private WebElement submitButton;

    public RestorePasswordPage(WebDriver driver){
        super(driver);
    }

    public boolean isUserLoginFieldActiveByDefault(WebDriver driver){
        return driver.switchTo().activeElement().equals(userLoginField);
    }

    public void isSubmitButtonVisible(){
        submitButton.isDisplayed();
    }
    public void isUserLoginFieldVisible(){
        userLoginField.isDisplayed();
    }
}
