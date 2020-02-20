package Steps;

import PageObjects.BookingDetailsFlow;
import PageObjects.HomePage;
import PageObjects.PaymentPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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

        WebDriverWait wait = new WebDriverWait(driver, 20);

        homePage = new HomePage(driver, wait);
        bookingDetailsFlow = new BookingDetailsFlow(driver);
        paymentPage = new PaymentPage(driver);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



    }

    @Given("User is logged in")
    public void user_is_logged_in() {
        homePage.closeCookiesPopup();
        homePage.clickLogin();
        homePage.enterEmail("ryanairtester1234@gmail.com");
        homePage.enterPassword("Ryanair12");
        homePage.submitLogin();
    }

    @And("User makes a booking")
    public void user_makes_a_booking() {
        homePage.chooseDeparture("Dublin");
        homePage.chooseDestination("Berlin Schönefeld");
        homePage.chooseOneway();
        homePage.chooseDepartDate();
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