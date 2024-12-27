/*
package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.LoginPage;
import com.automation.utils.ExcelUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return ExcelUtils.readExcelData("data.xlsx", "LoginData");
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        // Add validation logic
    }
}
*/
