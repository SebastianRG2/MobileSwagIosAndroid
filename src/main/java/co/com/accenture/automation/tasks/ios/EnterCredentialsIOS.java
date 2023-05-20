package co.com.accenture.automation.tasks.ios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.accenture.automation.userinterfaces.Login.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterCredentialsIOS implements Task {
    Map<String, String> credentialsList;

    public EnterCredentialsIOS(Map<String, String> credentialsList) {
        this.credentialsList = credentialsList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_USER_IOS, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(credentialsList.get("user")).into(INPUT_USER_IOS),
                Enter.theValue(credentialsList.get("password")).into(INPUT_PASSWORD_IOS),
                Click.on(BTN_LOGIN_IOS),
                WaitUntil.the(LBL_PRODUCT_IOS, isVisible()).forNoMoreThan(30).seconds());
    }

    public static EnterCredentialsIOS login(Map<String, String> credentialsList) {
        return Tasks.instrumented(EnterCredentialsIOS.class, credentialsList);
    }
}
