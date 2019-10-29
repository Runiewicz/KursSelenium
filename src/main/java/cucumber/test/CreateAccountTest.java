package cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/my-store-registration.feature",
        plugin = {"pretty","html:out"})
public class CreateAccountTest {
}
