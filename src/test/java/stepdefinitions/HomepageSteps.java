package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.header.NavigationPageObject;

public class HomepageSteps {

    NavigationPageObject homepage = new NavigationPageObject();

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("Navigation is visable");
    }

    @When("^I select my account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        homepage.selectMyAccounButton();
    }

    @And("^I select Sign up button$")
    public void iSelectSignUpButton() throws Throwable {
        homepage.selectSignUpButton();
    }

    @And("^I navigate to Signup page$")
    public void iNavigateToSignUpPage() throws Throwable {
        iSelectMyAccountMenu();
        iSelectSignUpButton();

    }
}
