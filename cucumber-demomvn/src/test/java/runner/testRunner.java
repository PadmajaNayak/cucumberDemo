package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\features"},
glue= {"stepDefinition"},
monochrome=true,
plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}

)
public class testRunner {

}
