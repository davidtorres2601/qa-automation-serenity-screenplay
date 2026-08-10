package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SeleniumHomePage {

    public static final Target PAGE_TITLE = Target.the("título de Selenium")
            .locatedBy("h1");
}