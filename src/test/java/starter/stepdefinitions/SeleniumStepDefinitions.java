package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;

import net.serenitybdd.screenplay.targets.Target;
import starter.navigation.NavigateTo;
import starter.tasks.NavigateToDocumentation;

public class SeleniumStepDefinitions {

    @Given("{actor} abre la pagina de Selenium")
    public void abreLaPaginaDeSelenium(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.theSeleniumHomePage()
        );
    }

    @Then("{actor} debe visualizar el titulo {string}")
    public void debeVisualizarElTitulo(Actor actor, String titulo) {
        actor.attemptsTo(
                Ensure.that(TheWebPage.title())
                        .containsIgnoringCase(titulo)
        );
    }

    @When("{actor} navega a Documentation")
    public void navegaADocumentation(Actor actor) {
        actor.attemptsTo(
                NavigateToDocumentation.navigate()
        );
    }

    @Then("{actor} debe visualizar {string}")
    public void debeVisualizar(Actor actor, String texto) {
        actor.attemptsTo(
                Ensure.that(
                        Target.the("texto de la pagina")
                                .locatedBy("//*[contains(normalize-space(.), '" + texto + "')]")
                ).isDisplayed()
        );
    }
}