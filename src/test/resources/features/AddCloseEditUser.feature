Feature: Librarian able to add users
  4. As a librarian, I should be able to add users from users page.

  @librarianAdd

  Scenario: Librarian able to add users
    Given I am on the login page
    And I enter username "librarian46@library"
    And I enter password "YiDR3nCQ"
    And click the sign in button
    And User click on Users link
    And click the add user button
    Then add Full Name
    And add Password
    And add Email
    And choose Librarian in User Group
    And choose ACTIVE from status
    And add Start Date
    And add End Date
    And add Address
    Then click save changes button


