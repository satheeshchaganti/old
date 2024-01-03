package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features= {"D:\\bbb\\Feature Files\\Search.feature"},
		glue= {"stepDef"},
		plugin= {"pretty",
				"html:target/report/cucumber.html",
		"json:target/report/cucumber.json"},
		dryRun=false

		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
