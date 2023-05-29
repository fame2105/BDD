package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

    @Given("User is on NetBanking landing page")
    public void user_is_on_netbanking_login_page() throws Throwable {
        // code to navigate to landing page
        System.out.println("Executing step defination code for Given");
    }

    @When("User login into application with username = {string} and password = {string}")
    public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
        // code to login into application with username and password
        System.out.println("Username: " + arg1 + " and password: " + arg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        // code when home page is populated
        System.out.println("Executing step defination code for Then");
    }

    @And("Cards displayed = {string}")
    public void cards_are_displayed(String arg) throws Throwable {
        // code to check that cards are displayed after login from user
        if(arg.equals("true"))
            System.out.println("Cards are verified...username and password accepted");
        else
            System.out.println("Cards are not verified...username and password not accepted");
    }
}
