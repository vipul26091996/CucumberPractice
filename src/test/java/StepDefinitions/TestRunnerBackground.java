package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Background.feature", 
glue = {"BackgroundStepsDemo"},
monochrome = true, 
plugin = {"pretty","html:target/HtmlReports/bgreport.html",
				"json:target/JSONReports/bgreport.json",
				"junit:target/XmlReports/bgreport.xml"})

public class TestRunnerBackground {

}
