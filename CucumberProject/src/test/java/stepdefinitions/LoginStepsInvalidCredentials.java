//package stepdefinitions;
//
//import com.example.pages.HomePage;
//import com.example.pages.LoginPage;
//import io.cucumber.java.en.*;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
////import static stepdefinitions.Hooks.driver;
//
//public class LoginStepsInvalidCredentials {
//    WebDriver driver = new ChromeDriver();
//    HomePage homePage = new HomePage(driver);
//    LoginPage loginPage = new LoginPage(driver);
//
//    @Given("the user is on the login page")
//    public void theUserIsOnTheLoginPage() {
//        driver.get("https://demowebshop.tricentis.com/");
//        homePage.findLoginPageLink().click();
//    }
//
//    @When("the user enters an email {string} and a password {string}")
//    public void theUserEntersAnEmailAndAPassword(String email, String password) {
//        loginPage.findEmailField().clear();
//        loginPage.findEmailField().sendKeys(email);
//        loginPage.findPasswordField().clear();
//        loginPage.findPasswordField().sendKeys(password);
//    }
//
//    @And("clicks the login button")
//    public void clicksTheLoginButton() {
//        loginPage.findLoginButton().click();
//    }
//
//    @Then("the user should see an error message {string}")
//    public void theUserShouldSeeAnErrorMessage(String errorMessage) {
//        String actualErrorMessage = loginPage.findErrorMessage().getText();
//        Assert.assertTrue(actualErrorMessage.contains(errorMessage));
//    }
//}