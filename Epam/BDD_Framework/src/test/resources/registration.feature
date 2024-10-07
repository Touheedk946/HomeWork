Feature: Registration on the shopping portal
  In order to make purchases
  As a new user
  I want to register on the shopping portal

  Scenario: Successful registration
    Given I am on the registration page
    When I fill in the registration form with valid details
    And I submit the form
    Then I should see a confirmation message

  Scenario: Registration with existing email
    Given I am on the registration page
    When I fill in the registration form with an existing email
    And I submit the form
    Then I should see an error message
