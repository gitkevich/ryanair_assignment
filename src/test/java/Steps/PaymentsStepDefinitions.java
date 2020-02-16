package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class PaymentsStepDefinitions {
    private WebDriver driver;
    private HomePage homePage;
    private BookingDetailsFlow bookingDetailsFlow;
    private PaymentPage paymentPage;

    @Given("User makes a booking from “DUB” to “SXF” on 12/03/2020 for 2 adults and 1 child")
    public void userMakesABooking() {
        homePage.clickDeparture();
        homePage.chooseDUB();
        homePage.clickDestination();
        homePage.chooseSXF();
        homePage.chooseOneway();
        homePage.clickDepartDate();
        homePage.chooseDate12032020();
        homePage.increaseAdultsCount();
        homePage.increaseChildrenCount();
        homePage.clickSearch();
        homePage.pickFlightCard();
        homePage.pickFareCard();
        homePage.fillAdult1Details();
        homePage.fillAdult2Details();
        homePage.fillChildDetails();
        homePage.clickContinueBooking();
        bookingDetailsFlow.closeFamilySeatingPopup();
        bookingDetailsFlow.addSeats();
        bookingDetailsFlow.finishChoosingSeats();
        bookingDetailsFlow.addCabinBags();
        bookingDetailsFlow.finishChoosingBags();
        bookingDetailsFlow.clickContinue(); //skipping "Anything else?" screen
        bookingDetailsFlow.viewBasket();
        bookingDetailsFlow.clickCheckout();
    }

    @When("I pay for booking with card details “5555 5555 5555 5557”, “10/20” and “265”")
    public void userPaysForBooking() {
        paymentPage.enterPhoneNumber();
        paymentPage.chooseNoInsurance();
        paymentPage.enterCardNumber();
        paymentPage.enterCardExpiryDate();
        paymentPage.enterCardCVV();
        paymentPage.enterCardholderName();
        paymentPage.fillAddressFields();
        paymentPage.chooseCurrency();
        paymentPage.confirmTermsAndConditions();
        paymentPage.clickPay();
    }

    @Then("I should get payment declined message \"Transaction could not be processed. Your payment was not authorised therefore we could not complete your booking. Please ensure that the information was correct and try again or use a new payment card.")
    public void iShouldGetPaymentDeclinedMessage() {
        String message = driver.findElement(By.xpath("/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[5]/payment-methods/div/div/div/ry-alert/div/div/div")).getText();
        assertTrue(message.contains("Transaction could not be processed. Your payment was not authorised therefore we could not complete your booking. Please ensure that the information was correct and try again or use a new payment card."));
    }
}