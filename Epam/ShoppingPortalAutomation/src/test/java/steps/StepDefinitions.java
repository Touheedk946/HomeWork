package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.RegistrationPage;
import pages.SignInPage;
import pages.DashboardPage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class StepDefinitions {
    private RegistrationPage registrationPage;
    private SignInPage signInPage;
    private DashboardPage dashboardPage;
    private String browser;

    public StepDefinitions(RegistrationPage registrationPage, SignInPage signInPage, DashboardPage dashboardPage) {
        this.registrationPage = registrationPage;
        this.signInPage = signInPage;
        this.dashboardPage = dashboardPage;

        // Load properties from cucumber.properties file
        Properties properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("cucumber.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find cucumber.properties");
                return;
            }
            // Load properties file
            properties.load(input);
            // Get the browser property
            browser = properties.getProperty("browser", "chrome"); // Default to chrome if not specified
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() {
        registrationPage.goTo();
    }

    @When("I fill in valid registration details")
    public void iFillInValidRegistrationDetails() {
        registrationPage.fillInValidDetails();
    }

    @When("I fill in valid details but use an already registered email")
    public void iFillInUsedEmail() {
        registrationPage.fillInWithUsedEmail();
    }

    @When("I fill in invalid registration details")
    public void iFillInInvalidDetails() {
        registrationPage.fillInInvalidDetails();
    }

    @When("I submit the registration form")
    public void iSubmitTheForm() {
        registrationPage.submit();
    }

    @Then("I should see the registration confirmation message")
    public void iShouldSeeConfirmationMessage() {
        Assert.assertTrue(registrationPage.isConfirmationMessageDisplayed());
    }

    @Then("I should see an error message saying the email is already in use")
    public void iShouldSeeEmailErrorMessage() {
        Assert.assertTrue(registrationPage.isEmailErrorMessageDisplayed());
    }

    @Then("I should see an error message for the invalid fields")
    public void iShouldSeeInvalidFieldsErrorMessage() {
        Assert.assertTrue(registrationPage.isInvalidFieldsErrorDisplayed());
    }

    @Given("I am on the sign-in page")
    public void iAmOnTheSignInPage() {
        signInPage.goTo();
    }

    @When("I enter valid login credentials")
    public void iEnterValidLoginCredentials() {
        signInPage.enterValidCredentials();
    }

    @When("I enter invalid login credentials")
    public void iEnterInvalidLoginCredentials() {
        signInPage.enterInvalidCredentials();
    }

    @When("I submit the login form")
    public void iSubmitLoginForm() {
        signInPage.submit();
    }

    @Then("I should be redirected to the dashboard")
    public void iShouldBeRedirectedToDashboard() {
        Assert.assertTrue(dashboardPage.isDashboardDisplayed());
    }

    @Then("I should see an error message saying the credentials are incorrect")
    public void iShouldSeeLoginErrorMessage() {
        Assert.assertTrue(signInPage.isLoginErrorDisplayed());
    }

    @Given("I am logged into my account")
    public void iAmLoggedIn() {
        signInPage.login();
    }

    @When("I click the sign-out button")
    public void iClickSignOutButton() {
        dashboardPage.signOut();
    }

    @Then("I should be redirected to the home page")
    public void iShouldBeRedirectedToHomePage() {
        Assert.assertTrue(dashboardPage.isLoggedOut());
    }

    @Given("I launch the browser")
    public void iLaunchTheBrowser() {
        // Use the browser property to launch the specific browser
        System.out.println("Launching browser: " + browser);
        // Add your WebDriver setup code here based on the browser variable
    }
}
