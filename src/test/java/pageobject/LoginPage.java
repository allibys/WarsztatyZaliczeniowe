package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys(email);
    }

    public void setPassword(String password) {
        WebElement element = driver.findElement(By.name("password"));
        element.sendKeys(password);
    }

    public void clickButtonSignIn() {
        WebElement element = driver.findElement(By.id("submit-login"));
        element.click();
    }



}




