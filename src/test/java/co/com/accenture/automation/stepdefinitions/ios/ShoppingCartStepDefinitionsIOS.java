package co.com.accenture.automation.stepdefinitions.ios;

import co.com.accenture.automation.exceptions.ExceptionError;
import co.com.accenture.automation.questions.ValidateProduct;
import co.com.accenture.automation.tasks.ios.SelectProductIOS;
import co.com.accenture.automation.utils.MsgError;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static co.com.accenture.automation.userinterfaces.ShoppingCart.LBL_PRODUCT_LIST_IOS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ShoppingCartStepDefinitionsIOS {
    @When("^the user in ios selects the (.*)$")
    public void theUserSelectsTheProduct(String product) {
        theActorInTheSpotlight().wasAbleTo(SelectProductIOS.listApp(product));
    }
    @Then("^he can view (.*) it in the shopping cart in ios$")
    public void heCanViewItInTheShoppingCart(String message) {
        theActorInTheSpotlight().should(seeThat(ValidateProduct.succesfully(LBL_PRODUCT_LIST_IOS.of(message)), Matchers.containsString(message)).orComplainWith(ExceptionError.class, MsgError.MSG_VALUE_ERROR_SHOPPING_CART.getMsg()));
    }
}
