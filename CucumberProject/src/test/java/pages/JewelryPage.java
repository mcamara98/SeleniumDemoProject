package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JewelryPage {
    WebDriver driver;
    public JewelryPage(WebDriver driver) {this.driver = driver; }
    public WebElement blackAndWhiteNecklace() {return driver.findElement(By.xpath("//h2/a[contains(text(), 'Black & White Diamond Heart')]"));}

    //Methode um Produkt hinzuzufügen
    public void clickBlackAndWhiteNecklace() { blackAndWhiteNecklace().click();}
    }