package co.com.accenture.automation.runners.android;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/shopping_cart.feature",
        glue = "co.com.accenture.automation.stepdefinitions.android",
        tags = "@ANDROID",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class ShoppingCart {
}
