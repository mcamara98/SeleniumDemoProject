Feature: Shopping cart feature

  Scenario Outline: Successful Price Calculation
    Given I am logged in
    And i click on "<category>"
    And I add product 1 and product 2 in my shopping cart
    When I click on shopping cart link
    Then I am directed to the shopping cart
    And the correct total price is shown
    Examples:
    | category  |
    | Books     |
