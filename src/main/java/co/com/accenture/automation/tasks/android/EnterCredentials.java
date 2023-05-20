package co.com.accenture.automation.tasks.android;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.accenture.automation.userinterfaces.Login.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class EnterCredentials implements Task {

    Map<String, String> credentialsList;

    public EnterCredentials(Map<String, String> credentialsList) {
        this.credentialsList = credentialsList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_USER, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(credentialsList.get("user")).into(INPUT_USER),
                Enter.theValue(credentialsList.get("password")).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN),
                WaitUntil.the(LBL_PRODUCT, isVisible()).forNoMoreThan(30).seconds());
    }

    public static EnterCredentials login(Map<String, String> credentialsList) {
        return Tasks.instrumented(EnterCredentials.class, credentialsList);
    }
}
