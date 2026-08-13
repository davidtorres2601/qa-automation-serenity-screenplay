package starter.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchFor implements Task {

    private final String text;

    public SearchFor(String text) {
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = Serenity.getDriver();

        ((JavascriptExecutor) driver).executeScript(
                "document.querySelector('button.DocSearch-Button').click();"
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ((JavascriptExecutor) driver).executeScript(
                "document.querySelector('#docsearch-input').focus();"
        );

        driver.switchTo().activeElement().sendKeys(text);
    }

    public static SearchFor term(String text) {
        return instrumented(SearchFor.class, text);
    }
}