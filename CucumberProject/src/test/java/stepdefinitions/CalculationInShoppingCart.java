package stepdefinitions;

import com.example.pages.ComputerPage;
import com.example.pages.HomePage;
import com.example.pages.JewelryPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalculationInShoppingCart {
    WebDriver driver = new ChromeDriver();
    HomePage homePage = new HomePage((driver));
    ComputerPage computerPage = new ComputerPage(driver);
    JewelryPage jewelryPage = new JewelryPage(driver);

    @Given("the user is on the home page")
    public void UserIsOnTheHomepage() {
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }

    @When("the user adds {string} to the cart")
    public void UserNavigatesToJewelryTab(String productName) {

        if (productName.equals("Black & White Diamond Heart Necklace")) {
            homePage.navigateToJewelry(); // Navigiere zur Jewelry-Seite
            jewelryPage.clickBlackAndWhiteNecklace(); // Wähle das Schmuckstück
            homePage.clickAddToCartButton(); // Klicke auf "In den Warenkorb"
            System.out.println("Added: " + productName + " with price: 130.00");
        } else if (productName.equals("Build your own cheap computer")) {
            homePage.navigateToComputer();
            computerPage.clickDesktopLink();
            homePage.clickComputer1(); // Wähle den Computer
            computerPage.addComputerToCart();
            System.out.println("Added: " + productName + " with price: 815.00");
        }
    }

    @Then("the total price in the cart should match {string}")
    public void theTotalPriceInTheCartShouldMatch(String expectedTotal) {
        homePage.viewShoppingCart(); // Öffne den Warenkorb
        String actualTotal = homePage.getCartTotal(); // Hole die Gesamtsumme

        // Vergleiche die erwartete Summe mit der tatsächlichen
        Assert.assertEquals("The cart total is incorrect!", expectedTotal, actualTotal);

        // Ausgabe des Ergebnisses
        System.out.println("Cart total is correct: " + actualTotal);
        driver.quit(); // Schließe den Browser
    }
}
