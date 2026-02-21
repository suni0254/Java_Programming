package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



//@Ruunerwith Cucumber tells junit to run this class using cucumber
//CucumberOptions it is a bridge of junit and cucumber
//features  location path
//glue it points to the package containg stepdefination class
//Tags excutes only taged with @tagname
//plugin display readble excuation blocks in the console
//monochrome is true it removes clour codes

@RunWith(Cucumber.class)
	@CucumberOptions(features= {"src/test/resources/Features/login.feature"},
		glue= {"Stepdefinitions"	},
		plugin= {"pretty","html:target/HTMLReports/report.html","json:target/JSONReports/report.json"})


public class TestRunner extends AbstractTestNGCucumberTests{
	


}
