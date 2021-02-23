Feature: Logout from library app

  As I user, I will be able to logout
  @logout
  Scenario Outline: Librarian or student can log out from the app
    Given I am on the login page
    And I login using "<email>" and "<password>"
    Then I will be able to logout
      
    Examples:
      | role      | email               | password | page      |
      | student   | student30@library   | IaT9YI0I | Books     |
      | student   | student31@library   | yOPdSR0u | Books     |
      | student   | student32@library   | GYLemAba | Books     |

    Examples:
      | role      | email               | password | page      |
      | librarian | librarian46@library | YiDR3nCQ | Dashboard |