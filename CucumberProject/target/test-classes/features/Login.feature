#Feature: Login to the website
#
# // Scenario: Successful Login
#   // Given I am on the website "https://demowebshop.tricentis.com/"
#   // When I click on tab "Log in" and fill with valid credentials
#   // Then I will be successfully logged in and redirected to the homepage
#
#
#  Scenario Outline: Login with invalid credentials
#    Given the user is on the login page
#    When the user enters an email "<email>" and a password "<password>"
#    And clicks the login button
#    Then the user should see an error message "<error_message>"
#
#    Examples:
#      | email              | password        | error_message                                                    |
#      | dummmy22@email.com | wrongpassword   | Login was unsuccessful. Please correct the errors and try again. |
#      | wrong@example.com  | password12345   | Login was unsuccessful. Please correct the errors and try again. |
