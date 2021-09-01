package stepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "src/test/java/org/automation/features",
        glue = {"stepDefinition"},
        junit = "--step-notifications",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/jsonReports/cucumber-report.json", "junit:target/cucumber-junit.xml"},
        tags = {"@E2E"},
        // tags--> @tag1 or @tag2 --> execute scenarios present with either of 1
        //tags--> @tag1 and @tag2 --> execute scenarios present with both tags only
        //tags --> not@tag1 --> exclude tags related scenarios
        dryRun = false)
//dry run true--> it will validate every feature has step defination or not
//monochrome = true --> it will funky (like %/ ? etc)values in output
// strict=true --> defualt applied in cucumber where for every feature should have step defination
public class TestRunner {
}
