package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
monochrome = true,
plugin = {"pretty"
		,"junit:target/JUnitReports/report.xml"
		,"html:target/HtmlReports/report.html"
		,"json:target/JUnitReports/report.xml"},
tags="@smoketest"
)
public class TestRunner {
}
