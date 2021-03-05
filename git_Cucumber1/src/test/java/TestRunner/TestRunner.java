package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue="Stepdefinitions",
monochrome=true,
plugin = {"pretty","junit:test-output/Reports/junit.xml",
		"json:junit:test-output/Reports/jsonreport.json",
		"html:junit:test-output/Reports/index.html"}
	    // tags = "@loginTest or @DocusignSanity"
		)

public class TestRunner {

}
