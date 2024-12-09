package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// Diese Anmerkung teilt JUnit mit, dass diese Klasse Cucumber-Tests ausführen soll
@RunWith(Cucumber.class)
// CucumberOptions wird verwendet, um verschiedene Optionen für Cucumber zu konfigurieren
@CucumberOptions(
        features = "src/test/resources/features", // Pfad zu deinen Feature-Dateien
        glue = "stepdefinitions", // Paketname, wo sich deine Step-Definitions befinden
        plugin = {"pretty", "html:target/cucumber-reports"} // Plugin für Berichterstattung
)
public class RunCucumberTestx {
}