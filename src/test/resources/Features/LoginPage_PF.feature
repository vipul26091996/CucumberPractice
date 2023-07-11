Feature: Verify the login functionality using Page Factory

  Scenario Outline: testing with valid credentials
    Given chrome browser is open
    And user is on the login page
    When user enters the <username> and <password>
    And click on login button
    Then user is redirect to form page

    Examples: 
      | username | password |
      | Vipul    |    12345 |
