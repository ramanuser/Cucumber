package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\CucumberFirst\\src\\test\\resources",glue="org.step",dryRun=false,strict=true,monochrome=true)

public class TestRunner {

}
