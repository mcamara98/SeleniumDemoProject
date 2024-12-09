package stepdefinitions;

import com.example.pages.HomePage;
import com.example.pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.BookCategoryPage;

public class ShoppingCartSteps {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    BookCategoryPage bookCategoryPage = new BookCategoryPage(driver);

    @Given("I am logged in")
    public void i_am_logged_in() {
        driver.get("https://demowebshop.tricentis.com/");
        homePage.findLoginPageLink().click();
        loginPage.findEmailField().sendKeys("dummmy22@email.com");
        loginPage.findPasswordField().sendKeys("password12345");
        loginPage.findLoginButton().click();
    }

    @And("i click on {string}")
    public void i_click_on(String categoryName) {
        homePage.findProductCategory(categoryName).click();
    }

    @And("I add product {int} and product {int} in my shopping cart")
    public void i_add_and_in_my_shopping_cart(int product1, int product2) throws InterruptedException {
        bookCategoryPage.findAddToCartButton(product1).click();
        Thread.sleep(2000);
        bookCategoryPage.findAddToCartButton(product2).click();
    }

    @When("I click on shopping cart link")
    public void i_click_on_shopping_cart_link() {
        homePage.findShoppingCartLink().click();
    }

    @Then("I am directed to the shopping cart")
    public void i_am_directed_to_the_shopping_cart() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/cart");
    }

    @And("the correct total price is shown")
    public void the_correct_total_price_is_shown() {

    }

}
