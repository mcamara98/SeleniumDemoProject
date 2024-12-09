package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComputerPage {
    WebDriver driver;
    public ComputerPage(WebDriver driver) {this.driver = driver; }
    public WebElement desktopLink() {return driver.findElement(By.xpath("//div[@class='sub-category-item']//a[@href='/desktops']"));}
    public WebElement addToCartButton2() {return driver.findElement(By.id("add-to-cart-button-72"));}

    public void clickDesktopLink() {desktopLink().click();}
    public void addComputerToCart() {addToCartButton2().click();}
}
