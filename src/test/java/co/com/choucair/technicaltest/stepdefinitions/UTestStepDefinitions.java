package co.com.choucair.technicaltest.stepdefinitions;

import co.com.choucair.technicaltest.model.SignUpData;
import co.com.choucair.technicaltest.questions.Verify;
import co.com.choucair.technicaltest.tasks.OpenUp;
import co.com.choucair.technicaltest.tasks.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Daniel wants to sign up at Utest$")
    public void thatDanielWantsToSignUpAtUtest() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage());
    }

    @When("^provides the required information for the registration process$")
    public void providesTheRequiredInformationForTheRegistrationProcess(List<SignUpData> signUpDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.user(signUpDataList.get(0)));
    }

    @Then("^he is registered as a new user at Utest$")
    public void heIsRegisteredAsANewUserAtUtest() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verify.SignUp()));
    }

}
