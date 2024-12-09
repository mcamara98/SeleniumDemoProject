#Scenario Outline: Login with invalid credentials
#Given the user is on the login page
#When the user enters an email "<email>" and a password "<password>"
#And clicks the login button
#Then the user should see an error message "<error_message>"
#
#Examples:
#| email              | password        | error_message                                                    |
#| dummmy22@email.com | wrongpassword   | Login was unsuccessful. Please correct the errors and try again. |
#| wrong@example.com  | password12345   | Login was unsuccessful. Please correct the errors and try again. |
