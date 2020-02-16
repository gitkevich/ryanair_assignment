Feature: Payments
  Scenario: Booking with a declined payment due to invalid card details
    Given User makes a booking from “DUB” to “SXF” on 12/03/2020 for 2 adults and 1 child
    When User pays for booking with card details “5555 5555 5555 5557”, “10/20” and “265”
    Then User should get payment declined message "Transaction could not be processed. Your payment was not authorised therefore we could not complete your booking. Please ensure that the information was correct and try again or use a new payment card.