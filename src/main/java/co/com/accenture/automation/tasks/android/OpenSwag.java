package co.com.accenture.automation.tasks.android;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.accenture.automation.userinterfaces.Login.BTN_LOGIN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class OpenSwag implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_LOGIN, isVisible()).forNoMoreThan(30).seconds());
    }

    public static OpenSwag app(){
        return Tasks.instrumented(OpenSwag.class);
    }
}
