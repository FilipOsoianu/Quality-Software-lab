import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"."},
        plugin = {"json:report/cucumber.json", "pretty","html:report/cucumber-reports.html"}
)


public class TestRunner {}