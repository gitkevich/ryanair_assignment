package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class PaymentsStepDefinitions {
    private WebDriver driver;
    private HomePage homePage;
    private BookingDetailsFlow bookingDetailsFlow;
    private PaymentPage paymentPage;

    @Before
    public void setUp()
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        bookingDetailsFlow = new BookingDetailsFlow(driver);
        paymentPage = new PaymentPage(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        homePage.open();
        homePage.closeCookiesPopup();
        homePage.clickLogin();
        homePage.enterEmail("ryanairtester1234@gmail.com");
        homePage.enterPassword("Ryanair12");
        homePage.submitLogin();
    }

    @Given("User makes a booking")
    public void user_makes_a_booking() {
        homePage.clickDeparture();
        homePage.chooseDUB();
        homePage.clickDestination();
        homePage.chooseSXF();
        homePage.chooseOneway();
        homePage.clickDepartDate();
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
        bookingDetailsFlow.addCabinBags();
        bookingDetailsFlow.skipAnythingElseScreen();
        bookingDetailsFlow.viewBasket();
        bookingDetailsFlow.clickCheckout();
    }

    @When("User pays for booking with invalid card details")
    public void user_pays_for_booking_with_invalid_card_details() {
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

    @Then("User should get payment declined message")
    public void user_should_get_payment_declined_message() {
        paymentPage.waitUntilPaymentErrorIsDisplayed();
        paymentPage.verifyErrorText();
   }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}