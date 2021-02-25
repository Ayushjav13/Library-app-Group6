Feature: User able to see modules one logged in

  3. As a user, I should be able to  see several modules once I login.

  @student1

  Scenario: Student able to see Books and Borrowing Books modules
    Given I am on the login page
    When I enter username "student30@library"
    And I enter password "IaT9YI0I"
    And click the sign in button
    Then User able to see following columns:

      | Books           |
      | Borrowing Books |

    @student2
  Scenario: Student able to see Books and Borrowing Books modules
    Given I am on the login page
    When I enter username "student31@library"
    And I enter password "yOPdSR0u"
    And click the sign in button
    Then User able to see following columns:

      | Books           |
      | Borrowing Books |


  @librarian1

  Scenario: Librarian able to see Dashboard, Books and Borrowing Books modules
    Given I am on the login page
    When I enter username "librarian46@library"
    And I enter password "YiDR3nCQ"
    And click the sign in button
    Then User able to see following columns:
      | Dashboard |
      | Users     |
      | Books     |