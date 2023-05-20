package co.com.accenture.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.targets.Target;
public class ValidateLogin implements Question {

    private Target target;

    public ValidateLogin(Target target) {
        this.target = target;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return target.resolveFor(actor).isVisible();
    }

    public static ValidateLogin succesfully(Target target) {
        return new ValidateLogin(target);
    }
}
