package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"json:target/cucumber.json",
        "pretty", "html:target/cucumber.html"},
        features = "src/test/resources/FeatureFiles")

public class Runner extends AbstractTestNGCucumberTests {
}
