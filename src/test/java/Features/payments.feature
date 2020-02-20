Feature: Payments
  Scenario: Booking with a declined payment due to invalid card details
    Given User is logged in
    And User makes a booking
    When User pays for booking with invalid card details
    Then User should get payment declined message