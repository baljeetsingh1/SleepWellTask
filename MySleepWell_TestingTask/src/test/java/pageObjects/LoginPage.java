package pageObjects;

import helper.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    By emailIdField = By.xpath("//input[@id='emailId']");
    By passwordField = By.xpath("//input[@id='currentPassword']");
    By loginButton = By.xpath("//body/div[@id='root']//input[@class='site-btn login-btn']");

    public void typeEmail(String email) {
        element(emailIdField).sendKeys(email);
    }

    public void typePassword(String password) {
        element(passwordField).sendKeys(password);
    }

    public void clickOnLoginpButton() {
        element(loginButton).click();
    }

}

