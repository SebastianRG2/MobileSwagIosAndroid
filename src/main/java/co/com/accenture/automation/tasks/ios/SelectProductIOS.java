package co.com.accenture.automation.tasks.ios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.accenture.automation.userinterfaces.Login.LBL_PRODUCT_IOS;
import static co.com.accenture.automation.userinterfaces.ShoppingCart.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectProductIOS implements Task {
    private String product;

    public SelectProductIOS(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_PRODUCT_IOS, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ADD_CART_IOS),
                WaitUntil.the(BTN_SHOPPING_CART_IOS, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_SHOPPING_CART_IOS)
        );
    }

    public static SelectProductIOS listApp(String product) {
        return Tasks.instrumented(SelectProductIOS.class, product);
    }
}


