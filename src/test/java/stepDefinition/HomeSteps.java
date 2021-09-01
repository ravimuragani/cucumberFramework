package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class HomeSteps {

    @Given("^user logged in$")
    public void user_logged_in() throws Throwable {
        System.out.println("this test is  given from Home page");

    }

    @When("^click profile tab$")
    public void click_profile_tab() throws Throwable {
        System.out.println("this test is  when from Home page");
    }

    @Then("^profile tab is opened$")
    public void profile_tab_is_opened() throws Throwable {
        System.out.println("this test is  then from Home page");
    }

}
