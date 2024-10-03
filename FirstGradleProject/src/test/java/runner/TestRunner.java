package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // Use Cucumber's JUnit runner
@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = "steps", // Path to step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"} // Report options
)
public class TestRunner {
}
