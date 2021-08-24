package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage {
    public WebDriver driver;

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void seeConfirmationMessage(String text) {
        WebElement element = driver.findElement(By.className("card-title"));
        Assert.assertTrue(element.getText().contains(text));
    }

}
