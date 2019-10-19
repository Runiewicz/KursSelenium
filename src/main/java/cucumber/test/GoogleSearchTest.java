package cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/home/anna/Dokumenty/Warsztaty/KursSelenium/src/Cucumber/Features/google-text-search.feature",
        plugin = {"pretty","html:out"})
public class GoogleSearchTest {
}
