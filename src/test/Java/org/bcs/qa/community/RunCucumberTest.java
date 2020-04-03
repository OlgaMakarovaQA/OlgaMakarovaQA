package org.bcs.qa.community;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@all",
        features = "src/test/features",
        glue = {"org.bcs"}
)
public class RunCucumberTest {
}