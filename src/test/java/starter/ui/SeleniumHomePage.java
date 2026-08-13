package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SeleniumHomePage {

    public static final Target SEARCH_BOX =
            Target.the("campo de búsqueda")
                    .locatedBy("#docsearch-input");

    public static final Target FIRST_RESULT =
            Target.the("primer resultado")
                    .locatedBy("//a[contains(.,'WebDriver')]");
}