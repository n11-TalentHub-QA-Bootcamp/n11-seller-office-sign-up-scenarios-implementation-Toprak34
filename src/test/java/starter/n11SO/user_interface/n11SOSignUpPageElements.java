package starter.n11SO.user_interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class n11SOSignUpPageElements {
    public static Target usernameInput = Target.the("username textBox").located(By.id("usernameInputText"));
    public static Target passwordInput = Target.the("password textBox").located(By.id("passwordInputText"));
    public static Target passwordRetypeInput = Target.the("password retry textBox").located(By.id("passwordRetypeInputText"));
    public static Target emailInput = Target.the("email textBox").located(By.id("emailInputText"));
    public static Target emailRetypeInput = Target.the("email retry textBox").located(By.id("emailRetypeInputText"));
    public static Target boutiqueNameInput = Target.the("nick name textBox").located(By.id("nicknameInputText"));
    public static Target acceptTermsAndConditions = Target.the("accept conditions").located(By.id("acceptTermsAndConditions"));
    public static Target signUpButton = Target.the("signUp button").located(By.id("j_id275_j_id_dk"));


}
