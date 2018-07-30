package pages.header;

import com.codeborne.selenide.SelenideElement;
import pages.signup.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    private SelenideElement myAccountButton = $("test");

    private SelenideElement getMyAccountButton() {

        return $("test");
    }

    private SelenideElement getSignUpButton() {
        return $("test");
    }

    public void selectMyAccounButton() {

        getMyAccountButton().click();
    }

    public SignUpPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPageObject.class);
    }
}
