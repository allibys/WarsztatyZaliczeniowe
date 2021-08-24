package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ZadaniaSteps {

    private MainPage pole1;  //deklaracja pola klasy
    private LoginPage pole2;
    private MyAccount pole3;
    private Adresses pole4;
    private NewAddress pole5;
    private ProductPage pole6;
    private ShoppingCart pole7;
    private ControllerOrderPage pole8;
    private ConfirmationPage pole9;

    private WebDriver driver;

    @Given("an open browser with https://prod-kurs.coderslab.pl/index.php")
    public void openMyStore() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pole1 = new MainPage(driver);
    }

    @When("user clicks button Sign in")
    public void clickSignIn() {
        pole1.clickSignInButton();
        pole2 = new LoginPage(driver);
    }

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
        pole3 = new MyAccount(driver);
    }

    @And("click link Addresses on page's footer")
    public void clickLinkAddresses() {
        pole3.clickLinkAddresses();
        pole4 = new Adresses(driver);
    }

    @And("click link Create new address")
    public void clickLinkCreate() {
        pole4.clickLinkCreate();
        pole5 = new NewAddress(driver);
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

    @And("close browser")
    public void closeBrowser(){
        driver.quit();
    }

    @And("go to the page https://prod-kurs.coderslab.pl/index.php")
    public void openPage() {
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        pole1 = new MainPage(driver);
    }

    @And("click on the product: (.*)")
    public void clickOnTheProduct(String productName) {
        pole1.clickOnTheProduct(productName);
        pole6 = new ProductPage(driver);
    }

    @And("choose size (.*)")
    public void clickOnTheSize(String size) {
        pole6.clickOnTheSize(size);
    }

    @And("choose (.*) items of this size")
    public void setUpItemsAmount(String quantity) throws InterruptedException {
        pole6.setQuantity(quantity);
    }

    @And("add this product to the basket by clicking Add to cart")
    public void clickButton() {
        pole6.addToBasket();
    }

    @And("click button Proceed to checkout on the pop-up")
    public void clickButtonOnThePopUp() {
        pole6.clickPopUpButton();
        pole7 = new ShoppingCart(driver);
    }

    @And("click button Proceed to checkout in the basket")
    public void clickButtonInTheBasket() {
        pole7.clickButtonProceedToCheckout();
        pole8 = new ControllerOrderPage(driver);
    }

    @And("see selected address with data (.*), (.*), (.*), (.*), (.*), (.*)")
    public void seeSelectedAddress(String name, String address, String city, String code, String country, String phone) {
        pole8.checkAddress(name, address, city, code, country, phone);
    }

    @And("click button Continue on address element")
    public void clickButtonContinue() {
        pole8.clickContinue();
    }

    @And("choose method of receipt PrestaShop pick up in store")
    public void choosePickUpInStore() {
        pole8.selectPrestaShopPickUp();
    }

    @And("click button Continue on shipping method")
    public void clickContinueOnShippingMethod() {
        pole8.clickButtonContinue();
    }

    @And("choose payment method Pay by check")
    public void choosePaymentMethod() {
        pole8.selectPayByCheck();
    }

    @And("select the checkbox I agree to the terms of service and will adhere to them unconditionally.")
    public void agreeToTheTerms() {
        pole8.checkIAgreeToTheTerms();
    }

    @And("click button Order with an obligation to pay")
    public void clickButtonObligationToPay() {
        pole8.clickButtonOrderWithAnObligationToPay();
        pole9 = new ConfirmationPage(driver);
    }

    @Then("will see messages (.*)")
    public void seeOrderConfirmation(String text) {
        pole9.seeConfirmationMessage(text);
    }

    @And("take a screenshot")
    public void takeScreenshot() throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File DestFile = new File("test.png");
        FileUtils.copyFile(file, DestFile);
    }

}
