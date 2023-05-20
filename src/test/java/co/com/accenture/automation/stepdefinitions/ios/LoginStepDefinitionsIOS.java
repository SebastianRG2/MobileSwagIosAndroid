package co.com.accenture.automation.stepdefinitions.ios;

import co.com.accenture.automation.exceptions.ExceptionError;
import co.com.accenture.automation.questions.ValidateLogin;
import co.com.accenture.automation.tasks.ios.EnterCredentialsIOS;
import co.com.accenture.automation.tasks.ios.OpenSwagIOS;
import co.com.accenture.automation.utils.MobileDriverIOS;
import co.com.accenture.automation.utils.MsgError;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import org.hamcrest.Matchers;

import java.net.MalformedURLException;
import java.util.Map;

import static co.com.accenture.automation.userinterfaces.Login.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinitionsIOS {

    @Before
    public void onStage() throws MalformedURLException {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(MobileDriverIOS.instance())));
        theActorCalled("User");
    }

    @Given("^that the user enters the mobile app in ios$")
    public void theUserIsInTheMobileApp() {
        theActorInTheSpotlight().wasAbleTo(OpenSwagIOS.app());
    }

    @When("^the user enters his credentials in ios$")
    public void theUserEnterHisCredential(Map<String, String> credentialsList) {
        theActorInTheSpotlight().wasAbleTo(EnterCredentialsIOS.login(credentialsList));
    }

    @Then("^the user will be able to observe the successful login in ios$")
    public void theUserWillBeAbleToObserveTheSuccesfulLogin() {
        theActorInTheSpotlight().should(seeThat(ValidateLogin.succesfully(LBL_PRODUCT_IOS), Matchers.equalTo(true)).orComplainWith(ExceptionError.class, MsgError.MSG_VALUE_ERROR_LOGIN.getMsg()));
    }
}

