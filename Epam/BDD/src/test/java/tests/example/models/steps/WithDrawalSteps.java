package tests.example.models.steps;

import tests.example.models.Account;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class WithDrawalSteps {
    private Account account;
    private double requestedAmount;
    private double dispensedAmount;

    @Given("I have a balance of ${double} in my account for withdrawal")
    public void iHaveABalanceOfForWithdrawal(double balance) {
        account = new Account(balance);
    }


    @When("I request ${double} for withdrawal")
    public void iRequestForWithdrawal(double amount) {
        requestedAmount = amount;
        dispensedAmount = account.withdraw(requestedAmount);
    }

    @Then("${double} should be dispensed for withdrawal")
    public void shouldBeDispensedForWithdrawal(double amount) {
        Assertions.assertEquals(amount, dispensedAmount);
    }
}
