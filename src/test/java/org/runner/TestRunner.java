package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Cucumberproject\\src\\test\\resources\\Features\\best.feature",glue="org.stepprocess",
                           dryRun=false)

public class TestRunner {

}
