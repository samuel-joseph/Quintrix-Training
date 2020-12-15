@SmokeFeature
Feature: feature test add and delete button functionality
	@smoketest
	Scenario Outline: Add and delete button is successful
	
		Given user is on add remove element page
		When user clicks Add <addButton> Element button
		And user clicks Delete <delete> button
		Then user validates if number of <total> is correct
	
		Examples:
		|addButton|delete|total|
		|10	|	5		 |5|