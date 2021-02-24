Feature: Register
@wip
  Scenario: Make a registration
    Given As a user land on the homepage
    Then  Navigate to registration
    When user enters below information

      | username | AyseSaribasak  |
      | password | Saribasak1!    |
      | fullName | Ayse Saribasak |
      | email    | ishasaribasak  |

    Then the user should able to see title
