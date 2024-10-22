package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = {"steps"}, // Path to your step definitions package
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Report generation
        monochrome = true, // Makes the console output more readable
        tags = "@SmokeTest" // You can use tags to run specific scenarios
)
public class TestRunner {
    // No code is needed in this class. The annotations take care of everything.
}
