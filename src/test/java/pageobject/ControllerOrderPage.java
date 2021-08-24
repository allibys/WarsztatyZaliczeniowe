package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ControllerOrderPage {

    public WebDriver driver;

    public ControllerOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkAddress(String name, String address, String city, String code, String country, String phone) {
        WebElement element = driver.findElement(By.id("id-address-delivery-address-13606"));
        Assert.assertTrue(element.getText().contains(name));
        Assert.assertTrue(element.getText().contains(address));
        Assert.assertTrue(element.getText().contains(city));
        Assert.assertTrue(element.getText().contains(code));
        Assert.assertTrue(element.getText().contains(country));
        Assert.assertTrue(element.getText().contains(phone));
    }

    public void clickContinue() {
        WebElement element = driver.findElement(By.name("confirm-addresses"));
        element.click();
    }

    public void selectPrestaShopPickUp() {
        WebElement element = driver.findElement(By.cssSelector("label[for='delivery_option_1']"));
        element.click();
    }

    public void clickButtonContinue() {
        WebElement element = driver.findElement(By.name("confirmDeliveryOption"));
        element.click();
    }

    public void selectPayByCheck() {
        WebElement element = driver.findElement(By.cssSelector("label[for='payment-option-1']"));
        element.click();
    }

    public void checkIAgreeToTheTerms() {
        WebElement element = driver.findElement(By.name("conditions_to_approve[terms-and-conditions]"));
        element.click();
    }

    public void clickButtonOrderWithAnObligationToPay() {
        WebElement element = driver.findElement(By.cssSelector("div[id='payment-confirmation'] button"));
        element.click();
    }




}
