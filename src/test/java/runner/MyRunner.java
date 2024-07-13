package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Feature",
                 glue= {"stepdefinitions","hooks"},
                 plugin={"pretty", "html:target/htmlreport.html"})
public class MyRunner {

}
