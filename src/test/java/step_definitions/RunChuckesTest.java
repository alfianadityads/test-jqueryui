package step_definitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    tags = "@Interactions",
    features = { "classpath:features/" }, 
    glue = { "classpath:step_definitions" }, 
    plugin = { "pretty","html:target/site/cucumber-pretty", "json:target/cucumber/cucumber.json" }
)

public class RunChuckesTest {
    
}
