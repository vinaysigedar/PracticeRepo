Feature: Login to orange HRM

  Scenario Outline: Successful login to orange HRM
    Given user is on orange hrm login page
    And user enters username as "<username>"
    And user enters password as "<password>"
    And user clicks on login button
    Then user should be able to land on home page

    Examples:
      | username | password |
      | Admin    | admin123 |