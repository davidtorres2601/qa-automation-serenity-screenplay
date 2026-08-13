package starter.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFirstResult implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = Serenity.getDriver();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(
                By.cssSelector("#docsearch-item-0 a")
        ).click();
    }

    public static SelectFirstResult click() {
        return instrumented(SelectFirstResult.class);
    }
}