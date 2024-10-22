Feature: Sign-in and sign-out in the online shopping portal
  As a registered user
  I want to be able to sign in and sign out of the portal
  So that I can securely access my account.

  Scenario: Successful sign-in with valid credentials
    Given I am on the sign-in page
    When I enter valid login credentials
    And I submit the login form
    Then I should be redirected to the dashboard

  Scenario: Sign-in with invalid credentials
    Given I am on the sign-in page
    When I enter invalid login credentials
    And I submit the login form
    Then I should see an error message saying the credentials are incorrect

  Scenario: Sign-out after successful login
    Given I am logged into my account
    When I click the sign-out button
    Then I should be redirected to the home page
