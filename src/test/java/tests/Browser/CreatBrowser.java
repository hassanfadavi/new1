package tests.Browser;

import config.ConfigManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreatBrowser {

    public static void main(String[] args) {
        initializeWebDriver();
        driver.quit();
    }
   public   static WebDriver driver;

  public static WebDriver initializeWebDriver() {

       String browser=ConfigManager.getProperty("browser").toUpperCase();

        switch (browser) {
            case "CHROME":
                return driver = new ChromeDriver();

            case "FIREFOX":
                return driver = new FirefoxDriver();

            case "EDGE":
                return driver = new EdgeDriver();

            default:
                throw new IllegalArgumentException("Invalid");
        }
    }
}

//    if(browser.equalsIgnoreCase("chrome")) {
//
//        return driver = new ChromeDriver();
//    }else if(browser.equalsIgnoreCase("firefox")){
//        return driver = new FirefoxDriver();
//
//
//    }



