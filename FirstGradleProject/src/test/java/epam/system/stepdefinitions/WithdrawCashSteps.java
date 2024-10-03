package epam.system.stepdefinitions;

import epam.system.Bank.Account;
import epam.system.Bank.CashSlot;
import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithdrawCashSteps {

    private Account account;
    private CashSlot cashSlot;

    @Given("I have a balance of ${int} in my account")
    public void i_have_a_balance_in_my_account(int balance) {
        account = new Account(balance);
        cashSlot = new CashSlot();
    }

    @When("I request ${int}")
    public void i_request(int amount) {
        account.withdraw(amount, cashSlot);
    }

    @Then("${int} should be dispensed")
    public void amount_should_be_dispensed(int dispensedAmount) {
        assertEquals(dispensedAmount, cashSlot.getDispensedCash());
    }
}
