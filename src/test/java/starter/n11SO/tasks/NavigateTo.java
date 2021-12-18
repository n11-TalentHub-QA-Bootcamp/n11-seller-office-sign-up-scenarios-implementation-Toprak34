package starter.n11SO.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.n11SO.user_interface.n11SOHomePage;

public class NavigateTo {
    public static Performable theN11SOHomePage() {
        return Task.where("{0} opens the n11 so home page",
                Open.browserOn().the(n11SOHomePage.class));
    }
}
