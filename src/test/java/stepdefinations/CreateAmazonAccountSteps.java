package stepdefinations;

import base.BaseTest;
import config.ConfigManager;
import enums.WaitStrategy;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Amazon.CreatYourAccount_PF;
import pages.Amazon.Dashboard_PF;
import pages.Amazon.SignInPage_PF;
import utils.WaitUtils;

public class CreateAmazonAccountSteps extends BaseTest {


//    Dashboard_PF amazonDashboardPage;
//    SignInPage_PF amazonSignInPage;
    SignInPage_PF amazonSignInPage;
    CreatYourAccount_PF amazonCreateAccountPage;
    Dashboard_PF amazonDashboardPage;

 @Before
    public void setupDriver() {
       setup();
//        this.amazonDashboardPage =  new Dashboard_PF(driver);
//        this.amazonSignInPage = new SignInPage_PF(driver);
        this.amazonDashboardPage= new Dashboard_PF(driver);
        this.amazonSignInPage= new SignInPage_PF(driver);
        this.amazonCreateAccountPage = new CreatYourAccount_PF(driver);

    }

    @Given("I am on the amazon web page")
    public void I_am_on_the_amazon_web_page() {
//        setup();
//        driver.get(ConfigManager.getProperty("baseUrl"));
        Assert.assertEquals("failed", "https://www.amazon.com/", driver.getCurrentUrl());
        logger.info("I am on the amazon web page");
    }

    @When("I click on signIn button")
    public void I_click_on_signIn_button() {
        WaitUtils.applyWait(driver, amazonDashboardPage.signIn, WaitStrategy.VISIBLE);
        WaitUtils.applyWait(driver, amazonDashboardPage.signIn, WaitStrategy.CLICKABLE);
        amazonDashboardPage.clickOnSignIn();
        logger.info("I click on signIn button");
    }

    @Then("I click on Create amazon account button")
    public void I_will_click_on_create_amazon_account_button() {
                amazonSignInPage.clickOnCreateYourAmazonAccount();
        logger.info("I click on Create amazon account button");
    }

    @And("I will enter username as value for your name field")
    public void I_will_enter_username_as_value_for_your_name_field() {
        amazonCreateAccountPage.enterFullName("John Doe");
        logger.info("I will enter username as value for your name field");

    }


    @And ("I will enter valid {string} as input")
    public void I_will_enter_valid_input(String inputType){
     amazonCreateAccountPage.enterEmailAddressOrPhoneNumber(inputType);
//     if(inputType.equalsIgnoreCase("email")) {
//         amazonCreateAccountPage.enterEmailAddressOrPhoneNumber("s.hasanf@gmail.com");
//     }else if(inputType.equalsIgnoreCase("phone number")) {
//         amazonCreateAccountPage.enterEmailAddressOrPhoneNumber(240408644);
//     } else {
//         throw new IllegalArgumentException("invalid input");
//     }
        logger.info("I will enter valid {string} as input");
    }


    @And("I will enter password as a valid password value for password field")
    public void I_will_enter_password_as_a_valid_password_as_a_value_for_password_field() {
        amazonCreateAccountPage.enterPassword("JohnDoe!@#123");
        logger.info("I will enter password as a valid password value for password field");
    }

    @And("I will  re-enter-password as a valid password value")
    public void I_will_re_enter_the_password_as_a_valid_password_value() {
        amazonCreateAccountPage.reEnterPassword("JohnDoe!@#123");
        logger.info("I will  re-enter-password as a valid password value");
    }

    @Then ("I click on continue button")
    public void  I_click_on_continue_button(){
        amazonCreateAccountPage.clickOnContinueButton();
        logger.info("I click on continue button");

    }

    @After
    public void tearDownDriver() {
        tearDown();
    }


}
