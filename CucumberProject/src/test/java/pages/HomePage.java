
package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;


    private By LoginPageLink = By.xpath("//a[normalize-space()='Log in']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement findLoginPageLink () {
        return driver.findElement(LoginPageLink);
    }
    public WebElement jewelryTab() { return driver.findElement((By.linkText("Jewelry"))); }
    public WebElement shoppingCart () { return driver.findElement(By.id("topcartlink"));}
    public WebElement computerTab() { return  driver.findElement(By.cssSelector("a[href='/computers']"));}
    //public WebElement computerTab() {return driver.findElement(By.xpath("//a[text()='Computers']"));}
    public WebElement computer1 () { return driver.findElement(By.xpath("//img[@title='Show details for Build your own cheap computer']"));}
    public WebElement addToCartButton() { return driver.findElement(By.id("add-to-cart-button-14"));}
    public WebElement cartTotal() { return driver.findElement(By.cssSelector(".order-total strong"));}

    //Methode um Warenkorb anzuklicken
    public void navigateToJewelry() { jewelryTab().click();}
    public void navigateToComputer() { computerTab().click();}
    public void viewShoppingCart() { shoppingCart().click(); }
    public void clickComputer1() { computer1().click();}
    public void clickAddToCartButton() {addToCartButton().click();}
    // Gesamtsumme aus dem Warenkorb holen
    public String getCartTotal() { return cartTotal().getText().trim();// Rückgabe des Texts der Gesamtsumme
    }

}

