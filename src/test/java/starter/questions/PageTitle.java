package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PageTitle implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return actor.recall("pageTitle");
    }

    public static PageTitle value() {
        return new PageTitle();
    }
}