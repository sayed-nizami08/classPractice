package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)	

@CucumberOptions(features="C:\\Users\\ahmad\\eclipse-workspace\\Cucumber_Selenium\\src\\test\\resources\\Features",
glue={"stepdefs"})						
public class Runner 				
{		

}