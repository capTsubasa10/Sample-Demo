package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\THIS PC\\eclipse-workspace\\CucumberOnePm\\Features\\Mails.feature" ,
glue = "StepDefinition",
plugin = {"pretty", "html:Reports/report1.html", "junit:Reports/report2.xml"
		, "json:Reports/report3.json"},
monochrome = true,
dryRun = false,
tags = "not @Regression"



)

public class Runner {

}
