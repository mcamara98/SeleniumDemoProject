//package runners;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;
//
//public class RunCucumberTest {
//
//    // Diese Anmerkung teilt JUnit mit, dass diese Klasse Cucumber-Tests ausführen soll
//    @RunWith(Cucumber.class)
//
//// CucumberOptions wird verwendet, um verschiedene Optionen für Cucumber zu konfigurieren
//    @CucumberOptions(
//            features = "src/test/resources/features", // Gibt den Pfad zu den .feature-Dateien an, die ausgeführt werden sollen.
//            glue = {"stepdefinitions"}, // Pfad zu den Step Definitions
//            plugin = {"pretty", "html:target/cucumber-reports.html"} // Plugins für die Ausgabe der Testergebnisse -pretty sorgt für eine lesbare Ausgabe im Terminal.
//    )
//    public class RunCucumberTest {
//    }
//}
