package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class Adresses {

    public WebDriver driver;

    public Adresses(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkCreate() {
        WebElement element = driver.findElement(By.cssSelector("div[class='addresses-footer'] a"));
        element.click();
    }

    public void displayAllertSuccess(String message) {
        WebElement element = driver.findElement(By.cssSelector("article[class='alert alert-success'] li"));
        Assert.assertEquals(message, element.getText());
    }

    public void displayData(String alias, String name, String address, String city, String code, String country, String phone) {
        WebElement element = driver.findElement(By.cssSelector("div[class='address-body'] h4"));
        Assert.assertEquals(alias, element.getText());
        WebElement element2 = driver.findElement(By.cssSelector("div[class='address-body'] address"));
        String dataText = element2.getText();
        assertTrue(dataText.contains(name));
        assertTrue(dataText.contains(address));
        assertTrue(dataText.contains(city));
        assertTrue(dataText.contains(code));
        assertTrue(dataText.contains(country));
        assertTrue(dataText.contains(phone));
    }

}
