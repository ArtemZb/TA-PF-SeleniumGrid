package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import pages.*;
import utils.CapabilityFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    private static final String EPICENTRK_URL = "https://epicentrk.ua/";
    protected static final long DEFAULT_WAITING_TIME = 60;

    private CapabilityFactory capabilityFactory = new CapabilityFactory();
    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();



    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setUp(String browser) throws MalformedURLException {
        driver.set(new RemoteWebDriver(new URL(" http://192.168.0.34:4444/wd/hub"), capabilityFactory.getCapabilities(browser)));
        getDriver().get(EPICENTRK_URL);
    }

    @AfterMethod
    public void tearDown(){
        getDriver().close();
    }

    @AfterClass
    void terminate() {
        driver.remove();
    }

    public  WebDriver getDriver(){
        return driver.get();
    }

    public HeaderPage getHeaderPage(){
        return new HeaderPage(getDriver());
    }

    public RestorePasswordPage getRestorePasswordPage(){
        return new RestorePasswordPage(getDriver());
    }

    public SearchResultsPage getSearchResultsPage(){
        return new SearchResultsPage(getDriver());
    }

    public ProductsListPage getProductsListPage(){
        return new ProductsListPage(getDriver());
    }
}
