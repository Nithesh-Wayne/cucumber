package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/resources/sample7.feature"},glue="stepdef",
//plugin="html:target/htmlreport")
//plugin="json:target/cucumber.json")
plugin="junit:target/xmlreport.xml")
//tags={"@regression,@smoke"})
public class RunnerClass {

}
