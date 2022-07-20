Feature: To validate the login functionality of face book application

  Scenario Outline: To validate the login functionality with invalid crendtials
    Given To user should be in facebook loginpage
    When The user has to fill "<username>"  and "<passwod>"
    When The user has to click button
    Then The user should navigate to the invalid login page

    Examples: 
      | username | password |
      | mahe     |    12345 |
      | hari     |    98767 |
      | dinesh   |    46797 |
      | vino     |    49647 |
