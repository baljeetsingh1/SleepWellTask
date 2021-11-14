package pageObjects;

import helper.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static helper.Helper.getWebDriver;

public class SelectCityPage extends PageObject {
    By dropdown = By.xpath("//div[@class='select-city-wrapper']//div[contains(@class,'indicator')]");
    By submitButton = By.xpath("//div[@class='select-city-wrapper']//input[@type='submit']");

    public void selectCity(String cityName) {
        element(dropdown).click();
        wait(5);
        WebElement itemInDropdown = getWebDriver().findElement(By.xpath("//div[contains(text(),'" + cityName + "')]"));
        itemInDropdown.click();
        wait(5);
    }

    public void clickOnSubmitButton() {
        element(submitButton).click();
    }

}

