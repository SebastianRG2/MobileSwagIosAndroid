package co.com.accenture.automation.tasks.ios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.accenture.automation.userinterfaces.Login.BTN_LOGIN;
import static co.com.accenture.automation.userinterfaces.Login.BTN_LOGIN_IOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenSwagIOS implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_LOGIN_IOS, isVisible()).forNoMoreThan(30).seconds());
    }

    public static OpenSwagIOS app(){
        return Tasks.instrumented(OpenSwagIOS.class);
    }
}
