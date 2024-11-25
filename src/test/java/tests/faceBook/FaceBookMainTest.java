package tests.faceBook;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Fcebook.FaceBookMain_PF;
import utils.WaitUtils;

import static enums.WaitStrategy.CLICKABLE;

public class FaceBookMainTest extends BaseTest {


    @Test
    public void loginTest(){

       String expectedUrl="https://www.facebook.com/";
       String actualUrl=driver.getCurrentUrl();
        //Assert
        Assert.assertEquals(actualUrl,expectedUrl,"Failed");
        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");


        FaceBookMain_PF faceBookMainPf=new FaceBookMain_PF(driver);
        //userName
        faceBookMainPf.inputUserName("hassan");
        WaitUtils.applyWait(driver,faceBookMainPf.userName,CLICKABLE);
        logger.info("Verifying that the userName passe");
        WaitUtils.applyGlobalWait();

        //pass
        faceBookMainPf.inputPassWord("123456789");
        WaitUtils.applyWait(driver,faceBookMainPf.passWord,CLICKABLE);
        logger.info("Verifying that the password passed");
        WaitUtils.applyGlobalWait();

        //loginButton
        faceBookMainPf.loginButton();
        WaitUtils.applyWait(driver,faceBookMainPf.loginButton,CLICKABLE);
        WaitUtils.applyGlobalWait();





    }



}
