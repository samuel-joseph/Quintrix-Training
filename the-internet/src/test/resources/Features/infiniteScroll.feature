@SmokeFeature
Feature: Inifinite Scroll Test
Test the limitation of scroll

	@smoketest
  Scenario Outline: Scrolls infinitely
    Given User is in scroll page
    When User scrolls the page <scroll> times
    Then I verify if <title> exist in page

    Examples: 
      | scroll| title |
      | 100 |Infinite Scroll|
 
