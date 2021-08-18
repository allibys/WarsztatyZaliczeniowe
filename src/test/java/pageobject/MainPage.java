package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage {

    public WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignInButton() {
        WebElement element = driver.findElement(By.cssSelector("div[class='user-info'] a"));
        element.click();
    }


}
