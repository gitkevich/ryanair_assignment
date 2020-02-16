package bdd.tests.ryanair;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentsStepDefinitions {
    @Given("User makes a booking from “DUB” to “SXF” on {int}\\/{int}\\/{int} for {int} adults and {int} child")
    public void userMakesABooking(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @When("I pay for booking with card details “{int} {int} {int} {int}”, “{int}\\/{int}” and “{int}”")
    public void userPaysForBooking(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
    }

    @Then("I should get payment declined message \"Transaction could not be processed. Your payment was not authorised therefore we could not complete your booking. Please ensure that the information was correct and try again or use a new payment card.")
    public void iShouldGetPaymentDeclinedMessage() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        // }
    }
}