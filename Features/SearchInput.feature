Feature: Changing inputs in the google search

  Scenario: Searching through google search
    Given open the chrome browser
    And load the url of google
    When provide the input as "Jeep Car" and press enter
    Then Count and Verify the results
