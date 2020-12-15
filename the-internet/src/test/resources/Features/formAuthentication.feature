Feature: feature test login functionality

Scenario: Login is successful

Given User is on login page
When User enters "tomsmith"  and "SuperSecretPassword!"
And User clicks login
Then User verifies if he is logged in

#Examples:
#|username|password|
#|tomsmith|SuperSecretPassword!|