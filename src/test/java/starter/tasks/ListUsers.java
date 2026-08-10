package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ListUsers implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource("/users")
                        .with(request -> request
                                .queryParam("page", 2)
                                .header("x-api-key", "free_user_3Hhfq3gIZaJn3y7pVesf7DtVJ2K")
                        )
        );
    }

    public static Task fromReqRes() {
        return new ListUsers();
    }
}