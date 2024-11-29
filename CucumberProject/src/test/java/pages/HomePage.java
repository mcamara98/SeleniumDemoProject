
package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    // URL of the home page (adjust as necessary)
    private By LoginPageLink = By.xpath("//a[normalize-space()='Log in']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    public WebElement findLoginPageLink () {
        return driver.findElement(LoginPageLink);
    }
}

