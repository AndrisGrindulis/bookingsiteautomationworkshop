package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class LoginSteps {
    @And("^I select Login button$")
    public void iSelectLoginButton() throws Throwable {
        selectLoginbutton();
    }
}
