package co.com.accenture.automation.stepdefinitions.android;

import co.com.accenture.automation.exceptions.ExceptionError;
import co.com.accenture.automation.questions.ValidateProduct;
import co.com.accenture.automation.tasks.android.SelectProduct;
import co.com.accenture.automation.utils.MsgError;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;


import static co.com.accenture.automation.userinterfaces.ShoppingCart.LBL_PRODUCT_LIST;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ShoppingCartStepDefinitions {

    @When("^the user selects the (.*)$")
    public void theUserSelectsTheProduct(String product) {
        theActorInTheSpotlight().wasAbleTo(SelectProduct.listApp(product));
    }

    @Then("^he can view (.*) it in the shopping cart$")
    public void heCanViewItInTheShoppingCart(String message) {
        theActorInTheSpotlight().should(seeThat(ValidateProduct.succesfully(LBL_PRODUCT_LIST.of(message)), Matchers.containsString(message)).orComplainWith(ExceptionError.class, MsgError.MSG_VALUE_ERROR_SHOPPING_CART.getMsg()));
    }
}
