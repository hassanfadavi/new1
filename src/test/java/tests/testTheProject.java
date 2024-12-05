package tests;

import base.BaseTest;
import config.ConfigManager;
import config.DriverFactory;
import org.testng.annotations.Test;

public class testTheProject extends BaseTest {

//
//    @Test
//    public void testTheProject(){
//    }



    public static void main(String[] args) {
//        System.out.println(ConfigManager.getProperty("env"));
//        System.out.println(ConfigManager.getProperty("browser"));
//        System.out.println(ConfigManager.getProperty("isHeadless"));
//        System.out.println(ConfigManager.getProperty("EnableWait"));
//        System.out.println(ConfigManager.getProperty("timeout"));
//        ConfigManager.loadProperties();
           DriverFactory.initializeWebDriver();
    }


}
