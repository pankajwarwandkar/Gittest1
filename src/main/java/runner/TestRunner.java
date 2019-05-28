package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

//@RunWith(Cucumber.class)
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/feature/login.feature" ,glue="src/main/java/stepdefination/StepDefenation1.java")


//@RunWith(Cucumber.java)
public class TestRunner
{
  
	
	
}
