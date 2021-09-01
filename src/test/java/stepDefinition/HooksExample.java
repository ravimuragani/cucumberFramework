package stepDefinition;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksExample {

    @Before("@E2E")
    public void startUp()
    {
        System.out.println("this is startUp method from Hooks class and linked to Home page feature");
    }

    @After("@E2E")
    public void tearDown()
    {
        System.out.println("this is tearDown method from Hooks class and linked to Home page feature");
    }
}
