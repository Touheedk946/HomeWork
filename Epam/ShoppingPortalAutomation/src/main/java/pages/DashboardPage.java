package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    private WebDriver driver;

    // Locators
    private By accountDetailsLink = By.cssSelector(".account");  // Assuming locator for account details
    private By signOutButton = By.className("logout");           // Locator for sign-out button
    private By homePage = By.id("homepage");                     // Assuming locator for homepage after sign-out

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Check if dashboard is displayed
    public boolean isDashboardDisplayed() {
        return driver.findElement(accountDetailsLink).isDisplayed();
    }

    // Sign out from the account
    public void signOut() {
        driver.findElement(signOutButton).click();
    }

    // Check if user is logged out
    public boolean isLoggedOut() {
        return driver.findElement(homePage).isDisplayed();
    }
}
