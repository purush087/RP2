package com.regression.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter"}, glue = "com.regression.steps", features = "src/test/resources/")
@CucumberOptions(tags = "@ok", plugin = "com.regression.steps.RpListener", features = "src/test/resources/")
public class RunCukesTest {
}
