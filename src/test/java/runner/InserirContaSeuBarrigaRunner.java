package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		features = "src/test/resources/features/inserir_conta_seu_barriga.feature",
		glue = "steps"
		)
public class InserirContaSeuBarrigaRunner {

}
