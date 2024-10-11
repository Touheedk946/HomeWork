Feature: Coffee API
  @getCoffee
  Scenario: verify get coffee
    When user gets iced coffee
    Then user verify status code is 200
