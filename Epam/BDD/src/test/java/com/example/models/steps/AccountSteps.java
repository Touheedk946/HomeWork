/*
package com.example.models.steps;

import com.example.models.Account;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class AccountSteps {
    private Account account;
    private double dispensedCash;

    @Given("I have a balance of ${double} in my account")
    public void iHaveABalanceOfInMyAccount(double balance) {
        account = new Account(balance);
    }

    @When("I request ${double}")
    public void iRequest(double amount) {
        dispensedCash = account.withdraw(amount);
    }

    @Then("${double} should be dispensed")
    public void shouldBeDispensed(double expectedAmount) {
        Assertions.assertEquals(expectedAmount, dispensedCash);
    }
}
*/
