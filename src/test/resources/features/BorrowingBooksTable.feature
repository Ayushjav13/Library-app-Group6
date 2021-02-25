Feature: Student able to see borrowing books tables with default info

  @borrowingTable
  Scenario: Borrowing Books sable columns names

    Given I am on the login page
    When I enter username "student30@library"
    And I enter password "IaT9YI0I"
    And click the sign in button
    And user click borrowing books module
    Then the user should see the following column names:
      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned ?       |
