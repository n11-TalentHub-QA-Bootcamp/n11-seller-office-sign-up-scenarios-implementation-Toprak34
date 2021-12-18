package starter.n11SO.signUp;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import starter.n11.navigation.login.LoginAsUser;
import starter.n11.navigation.user_interface.n11HomePageElements;
import starter.n11.navigation.user_interface.n11LoginPageElements;
import starter.n11SO.user_interface.n11SOHomePageElements;
import starter.n11SO.user_interface.n11SOSignUpPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SignUpAsUser implements Task {

    private final String usernameStr;
    private final String passwordStr;
    private final String tryPasswordStr;
    private final String email;
    private final String tryEmail;
    private final String boutiqueName;



    @Step("Open the n11SO")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(n11SOHomePageElements.registerButton),
                WaitUntil.the(n11SOSignUpPageElements.usernameInput, isClickable()).forNoMoreThan(2).seconds(),
                Click.on(n11SOSignUpPageElements.usernameInput),
                SendKeys.of(this.usernameStr).into(n11SOSignUpPageElements.usernameInput),

                Click.on(n11SOSignUpPageElements.passwordInput),
                SendKeys.of(this.passwordStr).into(n11SOSignUpPageElements.passwordInput),

                Click.on(n11SOSignUpPageElements.passwordRetypeInput),
                SendKeys.of(this.tryPasswordStr).into(n11SOSignUpPageElements.passwordRetypeInput),

                Click.on(n11SOSignUpPageElements.emailInput),
                SendKeys.of(this.email).into(n11SOSignUpPageElements.emailInput),

                Click.on(n11SOSignUpPageElements.emailRetypeInput),
                SendKeys.of(this.tryEmail).into(n11SOSignUpPageElements.emailRetypeInput),

                Click.on(n11SOSignUpPageElements.boutiqueNameInput),
                SendKeys.of(this.boutiqueName).into(n11SOSignUpPageElements.boutiqueNameInput),

                Click.on(n11SOSignUpPageElements.acceptTermsAndConditions),

                      //.thenHit(Keys.ENTER),
                WaitUntil.the(n11SOSignUpPageElements.signUpButton, isClickable()).forNoMoreThan(30).seconds()
        );


    }


    public SignUpAsUser(String usernameStr, String passwordStr, String tryPasswordStr, String email, String tryEmail, String boutiqueName) {
        this.usernameStr = usernameStr;
        this.passwordStr = passwordStr;
        this.tryPasswordStr = tryPasswordStr;
        this.email = email;
        this.tryEmail = tryEmail;
        this.boutiqueName = boutiqueName;

    }

    public static SignUpAsUser signUpPage (String usernameStr, String passwordStr, String tryPasswordStr, String email, String tryEmail, String boutiqueName ) {
        return instrumented(SignUpAsUser.class
                ,usernameStr,passwordStr,tryPasswordStr,email,tryEmail,boutiqueName);
    }


}
