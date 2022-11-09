package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/feature/CalculatorAssignment.feature"},
glue={"stepDefinition"},
//tags= {"@fblaunch"}) // Execution of one tag
//tags= {"@fblaunch","@launch"}) //And Condition
//tags= {"@fblaunch,@launch"}) //OR Condition
//tags= {"@full"}) //all tags in feature file
//tags= {"@full","~@googlelaunch1"}) 
tags= {"@RegressionTesting"})

public class TestRunner {

}
