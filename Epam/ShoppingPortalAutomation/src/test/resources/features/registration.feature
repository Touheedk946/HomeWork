Feature: Registration on online shopping portal
  As a new user
  I want to be able to register on the online shopping portal
  So that I can access the portal's services.

  Scenario: Successful registration with valid details
    Given I am on the registration page
    When I fill in valid registration details
    And I submit the registration form
    Then I should see the registration confirmation message

  Scenario: Registration with an already used email
    Given I am on the registration page
    When I fill in valid details but use an already registered email
    And I submit the registration form
    Then I should see an error message saying the email is already in use

  Scenario: Registration with invalid details
    Given I am on the registration page
    When I fill in invalid registration details
    And I submit the registration form
    Then I should see an error message for the invalid fields
