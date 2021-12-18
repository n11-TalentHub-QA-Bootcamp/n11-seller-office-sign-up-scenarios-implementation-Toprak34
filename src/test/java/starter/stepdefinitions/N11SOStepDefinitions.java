package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11SO.signUp.SignUpAsUser;
import starter.n11SO.tasks.NavigateTo;

public class N11SOStepDefinitions {

    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;


    @Given("user launch browser and open the signUp page")
    public void user_launch_browser_and_open_the_sign_up_page() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theN11SOHomePage());
    }

    @When("user signed in sellerOffice with valid credentials")
    public void user_signed_in_seller_office_with_valid_credentials() throws InterruptedException {
        actor.attemptsTo(SignUpAsUser.signUpPage("Hamza123", "Test123", "Test123",
                "test1234@gmail.com", "test1234@gmail.com", "TestBoutique"));

        Thread.sleep(9000);
    }

    @Then("user signed in sellerOffice successfully")
    public void user_signed_in_seller_office_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
