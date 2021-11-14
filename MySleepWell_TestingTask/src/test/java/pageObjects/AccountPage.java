package pageObjects;

import helper.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static helper.Helper.getWebDriver;

public class AccountPage extends PageObject {
    By logoutLink = By.xpath("//a[contains(text(),'Log out')]");
    By cityName = By.xpath("//*[@class='store-location store-location-cta']");

    public Boolean isDisplayed() {
        wait(5);
        return element(logoutLink).isDisplayed();
    }

    public String getCityName() {
        wait(5);
        return element(cityName).getText();
    }

}

