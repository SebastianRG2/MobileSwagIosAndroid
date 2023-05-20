package co.com.accenture.automation.stepdefinitions.android;

import co.com.accenture.automation.exceptions.ExceptionError;
import co.com.accenture.automation.questions.ValidateLogin;
import co.com.accenture.automation.tasks.android.EnterCredentials;
import co.com.accenture.automation.tasks.android.OpenSwag;
import co.com.accenture.automation.utils.MobileDriver;
import co.com.accenture.automation.utils.MsgError;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import org.hamcrest.Matchers;

import java.net.MalformedURLException;
import java.util.Map;


import static co.com.accenture.automation.userinterfaces.Login.LBL_PRODUCT;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinitions {

    @Before
    public void onStage() throws MalformedURLException {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(MobileDriver.instance())));
        theActorCalled("User");
    }

    @Given("^that the user enters the mobile app$")
    public void theUserIsInTheMobileApp() {
        theActorInTheSpotlight().wasAbleTo(OpenSwag.app());
    }

    @When("^the user enters his credentials$")
    public void theUserEnterHisCredential(Map<String, String> credentialsList) {
        theActorInTheSpotlight().wasAbleTo(EnterCredentials.login(credentialsList));
    }

    @Then("^the user will be able to observe the successful login$")
    public void theUserWillBeAbleToObserveTheSuccesfulLogin() {
        theActorInTheSpotlight().should(seeThat(ValidateLogin.succesfully(LBL_PRODUCT), Matchers.equalTo(true)).orComplainWith(ExceptionError.class, MsgError.MSG_VALUE_ERROR_LOGIN.getMsg()));
    }

}

