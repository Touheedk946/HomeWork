package steps;

import example.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_login_page() {
        loginPage.openLoginPage();
    }

    @When("user enters valid username and password")
    public void user_enters_valid_credentials() {
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password123");
        loginPage.clickLoginButton();
    }

    @Then("user should be redirected to the dashboard")
    public void user_should_be_redirected_to_dashboard() {
        assertTrue(loginPage.isUserOnDashboard(), "User is not on the dashboard");
    }
}
