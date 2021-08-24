package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageobject.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class Zadanie1Steps extends AbstractStep{

    private MainPage pole1;
    private LoginPage pole2;
    private MyAccount pole3;
    private Adresses pole4;
    private NewAddress pole5;

    private WebDriver driver;

//    @Given("an open browser with https://prod-kurs.coderslab.pl/index.php")
//    public void openMyStore() {
//        System.setProperty("webdriver.chrome.driver",
//                "src/main/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://prod-kurs.coderslab.pl/index.php");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        pole5 = new NewAddress(driver);
//        pole4 = new Adresses(driver);
//        pole3 = new MyAccount(driver);
//        pole2 = new LoginPage(driver);
//        pole1 = new MainPage(driver);
//    }
//
//    @When("user clicks button Sign in")
//    public void clickSignIn() {
//        pole1.clickSignInButton();
//    }

    @And("fill field Email with value (.*)")
    public void setEmail(String email) {
        pole2.setEmail(email);
    }

    @And("fill field Password with value (.*)")
    public void setPassword(String password) {
        pole2.setPassword(password);
    }

    @And("click button Sign In")
    public void clickButtonSignIn() {
        pole2.clickButtonSignIn();
    }

    @And("click link Addresses on page's footer")
    public void clickLinkAddresses() {
        pole3.clickLinkAddresses();
    }

    @And("click link Create new address")
    public void clickLinkCreate() {
        pole4.clickLinkCreate();
    }

    @And("fill form with Alias (.*), Address (.*), City (.*), Zip/Postal Code (.*), Country (.*), Phone (.*)")
    public void setForm(String alias, String address, String city, String code, String country, String phone) {
        pole5.setForm(alias, address, city, code, country, phone);
    }

    @And("click button Save")
    public void clickButtonSave() {
        pole5.clickButtonSave();
    }

    @Then("will see message (.*)")
    public void displayAllertSuccess(String message) {
        pole4.displayAllertSuccess(message);
    }

    @And("see added address with data (.*), (.*), (.*), (.*), (.*), (.*), (.*)")
    public void displayData(String alias, String name, String address, String city, String code, String country, String phone) {
        pole4.displayData(alias, name, address, city, code, country, phone);
    }

//    @And("close browser")
//    public void closeBrowser(){
//        driver.quit();
//    }

}
