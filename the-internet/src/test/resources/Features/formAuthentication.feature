Feature: Login Test
I want to test if the authentication works
Scenario: Login is successful

Given User is in login page
When User enters "tomsmith"  and "SuperSecretPassword!"
And User clicks login
Then User verifies if he is logged in

#Examples:
#|username|password|
#|tomsmith|SuperSecretPassword!|