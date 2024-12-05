package tests.Browser;

import config.ConfigManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreatBrowser extends  Base{


   public   static WebDriver driver;
  public static WebDriver initializeWebDriver() {
       String browser=ConfigManager.getProperty("browser").toUpperCase();
        switch (browser) {
            case "CHROME":
              driver = new ChromeDriver();
              break;

            case "FIREFOX":
                  driver = new FirefoxDriver();
                  break;

            case "EDGE":
                  driver = new EdgeDriver();
                  break;

            default:
                throw new IllegalArgumentException("Invalid");

        }
        return driver;
    }






}




