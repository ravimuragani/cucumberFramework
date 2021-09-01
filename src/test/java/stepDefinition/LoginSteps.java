package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
//import gherkin.ast.DataTable;
import io.cucumber.datatable.DataTable;// import this for DataTable to use
import gherkin.ast.TableRow;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
public class LoginSteps {

    @Given("Navigate to browser")
    public void navigate_to_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("this test is  Given from Login page");
    }

 /*   @When("user login to application with userName and password")
    public void user_login_to_application_with_userName_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("this test is from then");

    }*/

//    @Then("user successfully loggedin")
//    public void user_successfully_loggedin() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("this test is from then");
//    }

 /*   @When("user login to application with <userName> and <password>")
    public void user_login_to_application_with_userName_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("this test is from then");
    }*/

    @When("user login to application with {string} and {string}")
    public void userLoginToApplicationWithAnd(String name, String passwd) {

        System.out.println("this test is when from Loginpage: " + name + passwd);
    }

    //code to use Data table
    @Then("^user successfully loggedin and enter below details$")
    public void user_successfully_loggedin_and_enter_below_details(DataTable table) throws Throwable {
        List<List<String>> data = table.asLists();
        System.out.println("this test is  then from Login page");

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }

    }
    @Given("^check required browser$")
    public void check_required_browser() throws Throwable {
        System.out.println("this test is  given from Background");

    }

    @When("^invoke browser$")
    public void invoke_browser() throws Throwable {
        System.out.println("this test is  when from Background");

    }

    @Then("^validate browser opened$")
    public void validate_browser_opened() throws Throwable {
        System.out.println("this test is  then from Background");

    }
}