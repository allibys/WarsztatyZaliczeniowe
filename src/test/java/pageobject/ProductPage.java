package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    public WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnTheSize(String size) {
        WebElement element = driver.findElement(By.id("group_1"));
        Select selectObject = new Select(element);
        selectObject.selectByVisibleText(size);
}

    public void setQuantity(String quantity) throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.cssSelector("input[id='quantity_wanted'][class='input-group form-control']"));
        element.clear();
        element.sendKeys(quantity);
    }

    public void addToBasket() {


        WebElement element = driver.findElement(By.cssSelector("div[class='add'] button"));
        element.click();
    }

    public void clickPopUpButton() {
        WebElement webelement = driver.findElement(By.cssSelector("div[class='cart-content-btn'] a"));
        webelement.click();
    }




}
