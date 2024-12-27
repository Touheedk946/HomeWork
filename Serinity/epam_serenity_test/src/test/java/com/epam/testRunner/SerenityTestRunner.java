package com.epam.testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

/**
 * This is the test runner class for Serenity with Cucumber tests.
 * It uses the CucumberWithSerenity runner to run the tests .
 */
//@RunWith(CucumberWithSerenity.class)
@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.epam.stepdefs",
        tags = "@postCoffee"
)
public class SerenityTestRunner {
}
