Feature: Login to Library as librarian and students


  @G6-151
  Scenario Outline: As a user, I should be able to login to the library app and use <email>

    Given I am on the login page
    #When  the user login as a "<role>"
    And I login using "<email>" and "<password>"
    Then the user on  "<page>"

    @student
    Examples:
      | role      | email               | password | page      |
      | student   | student30@library   | IaT9YI0I | books     |
      | student   | student31@library   | yOPdSR0u | books     |
      | student   | student32@library   | GYLemAba | books     |

    @librarian
    Examples:
      | role      | email               | password | page      |
      | librarian | librarian46@library | YiDR3nCQ | Dashboard |