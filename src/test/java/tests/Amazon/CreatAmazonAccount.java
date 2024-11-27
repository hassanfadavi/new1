package tests.Amazon;

import base.BaseTest;
import com.google.errorprone.annotations.Var;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Amazon.Dashboard_PF;
import pages.Amazon.SignInPage_PF;
import pages.Amazon.CreatYourAccount_PF;
import utils.WaitUtils;

public class CreatAmazonAccount extends BaseTest {




  @Test
    public void CreateAccount(){
 
    Dashboard_PF dashboard_pf=new Dashboard_PF(driver);
    SignInPage_PF  signInPage_PF=new SignInPage_PF(driver);
    CreatYourAccount_PF creatYourAccount_PF=new CreatYourAccount_PF(driver);


       dashboard_pf.clickOnSignIn();
      WaitUtils.applyGlobalWait();
       signInPage_PF.clickOnCreateYourAmazonAccount();
    WaitUtils.applyGlobalWait();
       creatYourAccount_PF.enterFullName("hassanFdavai");

       creatYourAccount_PF.enterEmailAddressOrPhoneNumber("s.hasanfadavi3223@gmail.com");

       creatYourAccount_PF.enterPassword("123456@asd");

       creatYourAccount_PF.reEnterPassword("123456@asd");

       creatYourAccount_PF.clickOnContinueButton();
////


    }











}
