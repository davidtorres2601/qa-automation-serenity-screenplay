package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

public class UpdateUser implements Task {

    private final String name;
    private final String job;

    public UpdateUser(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public static Task withData(String name, String job) {
        return new UpdateUser(name, job);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Put.to("/users/2")
                        .with(request -> request
                                .header("x-api-key", "free_user_3Hhfq3gIZaJn3y7pVesf7DtVJ2K")
                                .contentType("application/json")
                                .body("""
                                    {
                                        "name": "%s",
                                        "job": "%s"
                                    }
                                    """.formatted(name, job))
                        )
        );
    }
}