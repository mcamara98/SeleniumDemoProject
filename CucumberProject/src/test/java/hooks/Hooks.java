//Hooks.java ist eine Klasse, die in Cucumber als spezielle Setup- und Teardown-Klasse
// verwendet wird. Hier definierst du Methoden, die vor (@Before) oder nach (@After) jedem
// Szenario ausgeführt werden

package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }
    @Before
    public void setup() {
        // Setze den Pfad zum ChromeDriver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ghazal Aslami\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

