package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAddress {

    public WebDriver driver;

    public NewAddress(WebDriver driver) {
        this.driver = driver;
    }

    public void setForm(String alias, String address, String city, String code, String country, String phone) {
        WebElement element = driver.findElement(By.name("alias"));
        element.sendKeys(alias);
        WebElement element2 = driver.findElement(By.name("address1"));
        element2.sendKeys(address);
        WebElement element3 = driver.findElement(By.name("city"));
        element3.sendKeys(city);
        WebElement element4 = driver.findElement(By.name("postcode"));
        element4.sendKeys(code);
        WebElement element5 = driver.findElement(By.name("id_country"));
        Select selectObject = new Select(element5);
        selectObject.selectByVisibleText(country);
        WebElement element6 = driver.findElement(By.name("phone"));
        element6.sendKeys(phone);
    }

    public void clickButtonSave() {
        WebElement element = driver.findElement(By.cssSelector("footer button[type='submit']"));
        element.click();
    }

}
