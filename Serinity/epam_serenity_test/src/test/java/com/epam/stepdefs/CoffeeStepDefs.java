package com.epam.stepdefs;


import com.epam.helpers.CoffeeHelper;
import com.epam.model.Coffee;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Shared;
import com.epam.model.Ingredient;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CoffeeStepDefs {


    @Shared
    CoffeeHelper coffeeHelper;


    @Given("I create a {string} coffee")
    public void createCoffee(String coffeeType, List<Map<String,String>> coffeeList){
        Serenity.setSessionVariable("CoffeeType").to(coffeeType);
        coffeeList.forEach(coffeeData -> {
            Coffee coffee = Coffee.builder()
                    .id(Integer.parseInt(coffeeData.get("id")))
                    .title(coffeeData.get("title"))
                    .description(coffeeData.get("description"))
                    .image(coffeeData.get("image"))
                    .ingredients(Arrays.asList(coffeeData.get("ingredients").split(",")))
                    .build();
            coffeeHelper.createCoffee(coffeeType, coffee);
            Serenity.setSessionVariable("Coffee").to(coffee);



        });
    }

    @Then("I verify response status as {int}")
    public void verifyStatusCode(int statucCode){
        coffeeHelper.verifyStatusCode(statucCode);
    }

    @And("I verify response time is less then {int} ms")
    public void verifyResponseTime(int expectedTime){
        coffeeHelper.verifyResponseTime(expectedTime);
    }

    @And("I Update coffee title to {string}")
    public void updateCoffeeTitle(String newTitle){
        Coffee coffee = (Coffee) Serenity.getCurrentSession().get("Coffee");
        coffee.setTitle(newTitle);
        coffeeHelper.updateCoffeeTitle(Serenity.sessionVariableCalled("CoffeeType"), coffee);
    }

    @When("I delete a created coffee")
    public void deleteCoffee(){
        String coffeeType =(String) Serenity.getCurrentSession().get("CoffeeType");
        String coffeeID = String.valueOf(((Coffee) Serenity.sessionVariableCalled("Coffee")).getId());
        coffeeHelper.deleteCoffee(coffeeType,coffeeID);
    }

    @And("I verify the coffee is deleted")
    public void verifyCoffeeDeleted(){
        String coffeeType =(String) Serenity.getCurrentSession().get("CoffeeType");
        String coffeeID = String.valueOf(((Coffee) Serenity.sessionVariableCalled("Coffee")).getId());
        coffeeHelper.getCoffee(coffeeType,coffeeID);
    }

}
