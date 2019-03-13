package com.sdevelopment.skt.management;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test/java/com/sdevelopment/skt/management/features" },
        glue = {"com.sdevelopment.skt.management.steps" })
public class CreateProductTestRunner {
}
