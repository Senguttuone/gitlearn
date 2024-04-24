package Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( plugin= {"json:target/cucumber-report.json"},
features = "src/test/resources/featurefiles/flightticket.feature", glue="Test", monochrome = true)

public class runner {

}
