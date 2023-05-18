package com.codefishQa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feaures/codefish",
        glue = "com/codefishQa/stepdef",
        dryRun = true,
        tags = "@regression",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt",
        "json:target/cucumber-reports/cucumber.json"}


)
public class ECRunner {

}
