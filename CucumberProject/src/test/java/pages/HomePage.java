
package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    private By loginPageLink = By.xpath("//a[normalize-space()='Log in']");
    private By shoppingCartLink = By.xpath("(//span[normalize-space()='Shopping cart'])[1]");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findLoginPageLink () {
        return driver.findElement(loginPageLink);
    }

    public WebElement findProductCategory(String categoryName){
        String productCategoryXPath = "(//a[normalize-space()='" + categoryName + "'])[1]";
        return driver.findElement(By.xpath(productCategoryXPath));
    }

    public WebElement findShoppingCartLink(){
        return driver.findElement(shoppingCartLink);
    }
}

