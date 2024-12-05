package tests.Browser;

import config.ConfigManager;
import config.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.ConcurrentHashMap;

public class Base {


    public WebDriver driver;
    private final String baseUrl=ConfigManager.getProperty("baseUrl");


    @BeforeMethod
    public void setUp() {

        driver = DriverFactory.initializeWebDriver();
        driver.get(baseUrl);

    }

    @AfterMethod
    public void tear(){
        if(driver !=null){
            driver.quit();
        }
    }
}

//