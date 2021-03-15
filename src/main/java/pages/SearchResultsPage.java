package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage{

    @FindBy(xpath = "//div[@id='bottom-sticky']")
    private WebElement productsList;

    @FindBy(xpath = "//div[@id='bottom-sticky']//a[contains(@onclick,'compare')]")
    private List<WebElement> compareProductsIcon;

    public SearchResultsPage(WebDriver driver){
        super(driver);
    }

    public WebElement getProductsList(){
        return productsList;
    }

    public void clickCompareItemsOnProducts(){
            compareProductsIcon.get(0).click();
    }
}
