package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookCategoryPage {
    WebDriver driver;

    //Constructor
    public BookCategoryPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement findAddToCartButton(int number){
        String addToCartButtonXPath = "(//input[@value='Add to cart'])[" + number + "]";
        return driver.findElement(By.xpath(addToCartButtonXPath));
    }
}
