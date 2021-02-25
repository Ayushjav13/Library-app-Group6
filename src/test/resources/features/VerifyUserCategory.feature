Feature: User Category and Status verification

  @UserCategory
  Scenario: Verify user categories

    Given I am on the login page
    When I enter username "librarian46@library"
    And I enter password "YiDR3nCQ"
    And click the sign in button
    And User click on Users link
    And User click on User Group dropdown
    Then the user should see the following options:
      | ALL       |
      | Librarian |
      | Students  |

  @UserStatus
  Scenario: Verify user categories

    Given I am on the login page
    When I enter username "librarian46@library"
    And I enter password "YiDR3nCQ"
    And click the sign in button
    And User click on Users link
    And User click on User Status dropdown
    Then the user should see the following status options:
      | ACTIVE   |
      | INACTIVE |
