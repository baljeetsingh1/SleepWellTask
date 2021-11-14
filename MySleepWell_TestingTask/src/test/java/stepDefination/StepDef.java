package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Constants;
import helper.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.AccountPage;
import pageObjects.LoginPage;
import pageObjects.SelectCityPage;
import pageObjects.SignUpPage;

import java.util.Random;

import static helper.Helper.getWebDriver;

public class StepDef {
    private SignUpPage signUpPage;
    private LoginPage loginPage;
    private SelectCityPage selectCityPage;
    private AccountPage accountPage;

    public StepDef(SignUpPage signUpPage, LoginPage loginPage, SelectCityPage selectCityPage, AccountPage accountPage) {
        this.signUpPage = signUpPage;
        this.loginPage = loginPage;
        this.selectCityPage = selectCityPage;
        this.accountPage = accountPage;
    }


    @Given("^I open login page of mysleepwell website$")
    public void i_open_mysleepwel_website() {
        Helper.openBrowser(Constants.LoginUrl);
    }

    @Given("^I select \"([^\"]*)\" city for local pricing$")
    public void i_select_city_for_local_pricing(String cityName) {
        selectCityPage.selectCity(cityName);
        selectCityPage.clickOnSubmitButton();
    }

    @When("^I login with valid username and password$")
    public void i_login_with_valid_username_and_password() {
        getWebDriver().switchTo().defaultContent();
        loginPage.typeEmail(Constants.testEmailId);
        loginPage.typePassword(Constants.testPassword);
        loginPage.clickOnLoginpButton();
    }

    @Then("^I should see my account page$")
    public void i_should_see_my_account_page() {
        Assert.assertTrue(accountPage.isDisplayed());
    }

    @Then("^I should see \"([^\"]*)\" city in header$")
    public void i_should_see_city_in_header(String cityName) {
        Assert.assertEquals(cityName, accountPage.getCityName());
    }

    @When("^I sign up with sleepwell$")
    public void i_sign_up_with_sleepwell() {
        signUpPage.clickOnCreateAccountLink();
        getWebDriver().switchTo().activeElement();
        signUpPage.typeFirstName("Baljeet");
        signUpPage.typeLastName("Singh");
        signUpPage.typeEmail("baljeetsinghdeol22" + new Random().nextInt() + "@gmail.com");
        signUpPage.typeMobileNumber("1234567890");
        signUpPage.typePassword("Test@1234");
        signUpPage.clickOnSignUpButton();
    }

}
