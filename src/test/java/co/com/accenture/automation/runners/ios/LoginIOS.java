package co.com.accenture.automation.runners.ios;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "co.com.accenture.automation.stepdefinitions.ios",
        tags = "@IOS",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class LoginIOS {
}
