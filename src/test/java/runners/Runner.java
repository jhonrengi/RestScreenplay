package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/servicios.feature",
        glue = "stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Delete"
)
public class Runner {
}
