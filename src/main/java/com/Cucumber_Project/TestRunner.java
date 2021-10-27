package com.Cucumber_Project;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
features = {"E:\\Test_Frameworks\\9pm_Batch-19th_Oct_21\\com.MavenProject\\App_Features\\test.feature"},


//the path of the feature files
//glue={"D:\\eclipse-ws\\root2\\CucumberProject\\src\\test\\java\\com\\sam\\StepDefinitions.java"}, //the path of the step definition files
plugin= {"pretty:target/cucumber-pretty.txt",
        "html:target/cucumber-html-report",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"
        }, //to generate different types of reporting
monochrome = true, //display the console output in a proper readable format //it will check if any step is not defined in step definition file
dryRun = false //to check the mapping is proper between feature file and step definition file
)

public class TestRunner extends AbstractTestNGCucumberTests{}

