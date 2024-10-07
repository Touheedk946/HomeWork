Feature: Sign-in and Sign-out on the shopping portal
  In order to manage my account
  As a registered user
  I want to sign in and sign out

  Scenario: Successful sign-in
    Given I am on the sign-in page
    When I enter valid credentials
    And I submit the sign-in form
    Then I should be signed in successfully

  Scenario: Sign-out
    Given I am signed in
    When I click the sign-out button
    Then I should be signed out successfully
