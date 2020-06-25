package co.com.choucair.certification.consumoservicio.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features ={ "src/test/resources/features/create_user.feature"},
        glue ={ "co.com.choucair.certification.consumoservicio.stepdefinitions","co.com.choucair.certification.consumoservicio.utils"},
        snippets = SnippetType.CAMELCASE )
public class RestCreateUser {
}
