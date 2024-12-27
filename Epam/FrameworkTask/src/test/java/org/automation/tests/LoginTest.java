package org.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("user");
        loginPage.enterPassword("password");
        loginPage.clickLoginButton();

        // Add validation logic
        Assert.assertTrue(driver.getTitle().contains("Home"));
    }
}
