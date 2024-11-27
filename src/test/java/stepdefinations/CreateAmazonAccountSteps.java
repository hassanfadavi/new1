package stepdefinations;

import base.BaseTest;
import config.ConfigManager;
import enums.WaitStrategy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import pages.Amazon.CreatYourAccount_PF;
import pages.Amazon.Dashboard_PF;
import pages.Amazon.SignInPage_PF;
import utils.WaitUtils;

public class CreateAmazonAccountSteps extends BaseTest {

    Dashboard_PF  dashboard_PF ;
    SignInPage_PF signInPage_PF ;
    CreatYourAccount_PF  creatYourAccount_PF;

    Dashboard_PF amazonDashboardPage;
    SignInPage_PF amazonSignInPage;
    CreatYourAccount_PF amazonCreateAccountPage;

    @Before
    public void setupDriver() {
        setup();

        this.amazonDashboardPage =  new Dashboard_PF(driver);
        this.amazonSignInPage = new SignInPage_PF(driver);
        this.amazonCreateAccountPage = new CreatYourAccount_PF(driver);
    }

    @Given("I am on the amazon web page")
    public void I_am_on_the_amazon_web_page() {
//        Assert.assertEquals("failed", "https://www.amazon.com/", driver.getCurrentUrl());
    }

    @When("I will click on signIn button")
    public void I_will_click_on_signIn_button() {
        WaitUtils.applyWait(driver, amazonDashboardPage.signIn, WaitStrategy.VISIBLE);
        WaitUtils.applyWait(driver, amazonDashboardPage.signIn, WaitStrategy.CLICKABLE);
        amazonDashboardPage.clickOnSignIn();
    }

    @Then("I will click on Create amazon account button")
    public void I_will_click_on_create_amazon_account_button() {
        amazonSignInPage.clickOnCreateYourAmazonAccount();
    }

    @And("I will enter username as value for your name field")
    public void I_will_enter_username_as_value_for_your_name_field() {
        amazonCreateAccountPage.enterFullName("John Doe");
    }

    @And("I will enter valid {string} as input")
    public void I_will_enter_valid_input(String inputType) {
        amazonCreateAccountPage.enterEmailAddressOrPhoneNumber(inputType);
    }


    @And("I will enter password as a valid password value for password field")
    public void I_will_enter_password_as_a_valid_password_as_a_value_for_password_field() {
        amazonCreateAccountPage.enterPassword("JohnDoe!@#123");
    }

    @And("I will re-enter the password as a valid password value")
    public void I_will_re_enter_the_password_as_a_valid_password_value() {
        amazonCreateAccountPage.reEnterPassword("JohnDoe!@#123");
    }

    @Then("I click on continue button")
    public void I_click_on_continue_button() {
        amazonCreateAccountPage.clickOnContinueButton();
    }

    @After
    public void tearDownDriver() {
        tearDown();
    }


}
