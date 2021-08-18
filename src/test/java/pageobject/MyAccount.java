package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {

    public WebDriver driver;

    public MyAccount(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkAddresses() {
        WebElement element = driver.findElement(By.cssSelector("a[title='Addresses']"));
        element.click();
    }


}
