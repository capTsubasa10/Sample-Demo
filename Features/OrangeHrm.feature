Feature: Validating the login functionality of OrangeHRM

  Scenario Outline: Validating with multiple inputs
    Given Load the firefox browser
    And Load the orangehrm url
    When Provide <username> and <password> in repestive textboxes
    And Click the login button
    Then Verify the outcome.

    Examples: 
      | username | password  |
      | Admin    | admin123  |
      | Apple    | apple456  |
      | Bobby    | bobby678  |
      | Cathy    | cathy789  |
      | Davies   | davies890 |
