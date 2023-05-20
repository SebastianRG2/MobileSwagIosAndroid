package co.com.accenture.automation.interactions;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


public class Swipe implements Interaction {

    private String product;

    public Swipe(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String locator = String.format("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"%s\").instance(0))", product);
        Target product = Target.the("Title with the name of the product").located(AppiumBy.androidUIAutomator(locator));
        actor.attemptsTo(Click.on(product));
    }

    public static Swipe downProduct(String product) {
        return Tasks.instrumented(Swipe.class, product);
    }
}
