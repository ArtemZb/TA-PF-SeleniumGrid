package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsListPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href,'kabeli/')]")
    private WebElement cables;

    @FindBy(xpath = "//a[contains(@data-href,'asc')]")
    private WebElement sortAscendingPrice;

    @FindBy(xpath = "//div[@id='bottom-sticky']")
    private List<WebElement> productsList;




    public ProductsListPage(WebDriver driver){
        super(driver);
    }

    public void clickCables(){
        cables.click();
    }

    public void clickOnSortAscendingPrice(){
        sortAscendingPrice.click();
    }

    public List<WebElement> getListOfProductItems(){
        return productsList;
    }

    public boolean isProductSortedAscendingPrice(){
        boolean sorted = true;
        for (int i = 0; i < getListOfProductItems().size()-1; i++){
            String currentItemPrice = getListOfProductItems().get(i).getText();
            String nextItemPrice =  getListOfProductItems().get(i+1).getText();
           if(Integer.parseInt(currentItemPrice.substring(0,currentItemPrice.indexOf(" "))) >
                    Integer.parseInt(nextItemPrice.substring(0,nextItemPrice.indexOf(" ")))){
               sorted = false;
               break;
           }
        }
        return sorted;
    }
}
