package utils;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManager {

    public static ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-notifications");
        return chromeOptions;
    }

    public  static FirefoxOptions getFirefoxOptions(){
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--start-maximised");
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setAcceptUntrustedCertificates(true);
        firefoxProfile.setPreference("dom.webnotifications.enabled", false);
        firefoxProfile.setPreference("dom.push.enabled", false);
        firefoxProfile.setPreference("network.proxy.type",0);
        firefoxOptions.setCapability(FirefoxDriver.PROFILE,firefoxProfile);
        return firefoxOptions;

    }
}
