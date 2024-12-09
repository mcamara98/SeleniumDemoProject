Feature: Check calculation in shopping cart

  Scenario: Add products to the cart and verify the total price
    Given the user is on the home page
    When the user adds "Black & White Diamond Heart Necklace" to the cart
    And the user adds "Build your own cheap computer" to the cart
    Then the total price in the cart should match "945.00"

