package cucumberOptions;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/resources",
glue = "stepDefinitions",monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
