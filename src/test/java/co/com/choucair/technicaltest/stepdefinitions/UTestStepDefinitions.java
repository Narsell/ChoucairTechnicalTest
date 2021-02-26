package co.com.choucair.technicaltest.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Daniel wants to sign up at Utest$")
    public void thatDanielWantsToSignUpAtUtest() {

    }

    @When("^provides the required information for the registration process$")
    public void providesTheRequiredInformationForTheRegistrationProcess() {

    }

    @Then("^he is registered as an user at Utest$")
    public void heIsRegisteredAsAnUserAtUtest() {

    }

}
