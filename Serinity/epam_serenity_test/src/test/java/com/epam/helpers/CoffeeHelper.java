package com.epam.helpers;

import com.epam.model.Coffee;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;

public class CoffeeHelper {
    @Step
    public void createCoffee(String coffeeType , Coffee coffee){
        SerenityRest
                .given()
                .baseUri("http://api.sampleapis.com/coffee")
                .body(coffee)
                .contentType(ContentType.JSON)
                .when()
                .post("/"+coffeeType);
    }
    @Step
    public void verifyStatusCode(int httpStatusCode){
        SerenityRest
                .then()
                .statusCode(httpStatusCode);
    }
    @Step
    public void verifyResponseTime(int expectedResponseTime){
        SerenityRest
                .then()
                .time(Matchers.lessThanOrEqualTo((long) expectedResponseTime));
    }

    @Step
    public void updateCoffeeTitle(String coffeeType ,Coffee coffee){
        SerenityRest
                .given()
                .baseUri("http://api.sampleapis.com/coffee")
                .body(coffee)
                .contentType(ContentType.JSON)
                .when()
                .put("/"+coffeeType + "/" +coffee.getId());
    }

    @Step
    public void deleteCoffee(String coffeeType ,String coffee){
        SerenityRest
                .given()
                .baseUri("http://api.sampleapis.com/coffee")
                .when()
                .delete("/"+coffeeType + "/" +coffee);
    }

    @Step
    public void verifyGetCoffee (String coffeeType , String coffee){
        SerenityRest
                .given()
                .baseUri("http://api.sampleapis.com/coffee")
                .when()
                .get("/"+coffeeType + "/" +coffee);
    }
}
