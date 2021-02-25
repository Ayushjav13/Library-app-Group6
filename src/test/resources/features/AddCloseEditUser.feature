Feature: Librarian able to add users
  4. As a librarian, I should be able to add users from users page.

  @librarianAdd

  Scenario: Librarian able to add users
    Given I am on the login page
    When I enter username "librarian46@library"
    And I enter password "YiDR3nCQ"
    And click the sign in button
    And User click on Users link
    And click the add user button
    And add Full Name "Thierry Henry"
    And add Password "WordSH1P"
    And add Email "henry34@gmail.com"
    And choose Librarian in User Group "2"
    And choose "ACTIVE" from status
    And add Start Date "2021-02-15"
    And add End Date  "2021-03-15"
    And add Address "505 Arlington BLVD, Arlington, VA, 22033"
    Then click on close button

  @LibrarianEditUser

    Scenario: Librarian able to edit user

    Given I am on the login page
    When I enter username "librarian46@library"
    And I enter password "YiDR3nCQ"
    And click the sign in button
    And User click on Users link
    And User click on Edit User link
    And add Full Name "Ariungoo"
    And add Password "HALH15"
    And add Email "ariungoo11@gmail.com"
    And choose Librarian in User Group "3"
    And choose "ACTIVE" from status
    And add Start Date "2021-01-02"
    And add End Date  "2021-04-26"
    And add Address "6650 South Scott RD, Arlington, VA, 22034"
    Then click on save changes button
