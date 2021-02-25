Feature: Student able to see tables with default info

  @studentTable
  Scenario: Table columns names

    Given I am on the login page
    When I enter username "student30@library"
    And I enter password "IaT9YI0I"
    And click the sign in button
    Then the user should see the following column names:
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |