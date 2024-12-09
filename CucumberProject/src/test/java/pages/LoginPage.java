
package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    // Locators
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginButton = By.xpath("//input[@value='Log in']");
    private By errorMessage = By.xpath("//div[@class='validation-summary-errors']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with the login page
    public WebElement findEmailField () {
        return driver.findElement(emailField);
    }

    public WebElement findPasswordField() {
        return driver.findElement(passwordField);
    }

    public WebElement findLoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement findErrorMessage() {
       return driver.findElement(errorMessage);
    }
}
