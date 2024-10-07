package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillRegistrationForm(String email, String password) {
        driver.findElement(By.id("email_create")).sendKeys(email);
        driver.findElement(By.id("SubmitCreate")).click();
        // Add more form filling actions here
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void submitForm() {
        driver.findElement(By.id("submitAccount")).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(By.className("alert-success")).getText();
    }

    public String getErrorMessage() {
        return driver.findElement(By.className("alert-danger")).getText();
    }
}
