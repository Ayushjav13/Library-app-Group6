Feature: Library able to see book records on user page

  @showRecords
  Scenario: Verifying default record as 10
    Given I am on the login page
    When I enter username "librarian46@library"
    And I enter password "YiDR3nCQ"
    And click the sign in button
    And User click on Users link
    Then User see default value as 10
    And show records should have following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |

