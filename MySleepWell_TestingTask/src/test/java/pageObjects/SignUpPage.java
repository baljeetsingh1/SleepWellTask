package pageObjects;
import helper.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static helper.Helper.getWebDriver;

public class SignUpPage extends PageObject {
    By createAccountLink = By.xpath("//a[contains(text(),'New to Sleepwell? Create a new account')]");
    By firstNameField = By.xpath("//input[@id='First Name']");
    By lastNameField= By.xpath("//input[@id='lastName']");
    By emailField = By.xpath("//input[@id='emailId']");
    By mobileNumberField = By.xpath("//input[@id='mobileNumber']");
    By passwordField = By.xpath("//input[@id='currentPassword']");
    By signupButton = By.xpath("//body/div[@id='root']//input[@class='site-btn signup-btn']");

    public void clickOnCreateAccountLink() {
        element(createAccountLink).click();
        wait(5);
    }

    public void typeFirstName(String firstName) {
        element(firstNameField).sendKeys(firstName);
    }

    public void typeLastName(String lastName) {
        element(lastNameField).sendKeys(lastName);
    }

    public void typeEmail(String email) {
        element(emailField).sendKeys(email);
    }

    public void typeMobileNumber(String mobileNumber) {
        element(mobileNumberField).sendKeys(mobileNumber);
    }

    public void typePassword(String password) {
        element(passwordField).sendKeys(password);
    }

    public void clickOnSignUpButton() {
        element(signupButton).click();
    }


}

