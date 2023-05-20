package co.com.accenture.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateProduct implements Question {
    private Target target;

    public ValidateProduct(Target target) {
        this.target = target;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return target.resolveFor(actor).getText();
    }

    public static ValidateProduct succesfully(Target target) {
        return new ValidateProduct(target);
    }
}
