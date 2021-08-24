package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {
    public WebDriver driver;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonProceedToCheckout() {
        WebElement element = driver.findElement(By.cssSelector("div[class='checkout cart-detailed-actions card-block'] a"));
        element.click();
    }











}
