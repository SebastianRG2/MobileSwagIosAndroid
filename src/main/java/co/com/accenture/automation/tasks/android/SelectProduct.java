package co.com.accenture.automation.tasks.android;

import co.com.accenture.automation.interactions.Swipe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.accenture.automation.userinterfaces.Login.LBL_PRODUCT;
import static co.com.accenture.automation.userinterfaces.ShoppingCart.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectProduct implements Task {
    private String product;

    public SelectProduct(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_PRODUCT, isVisible()).forNoMoreThan(30).seconds(),
                Check.whether(LBL_PRODUCT_LIST.of(product).isVisibleFor(actor)).andIfSo(
                        Click.on(LBL_PRODUCT_LIST.of(product))
                ).otherwise(
                        Swipe.downProduct(product)
                ),
                Swipe.downProduct("AÑADIR A CARRITO"),
                Click.on(BTN_SHOPPING_CART)
        );
    }

    public static SelectProduct listApp(String product) {
        return Tasks.instrumented(SelectProduct.class, product);
    }
}


