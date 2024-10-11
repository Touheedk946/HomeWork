Feature: Coffee API
  @postCoffee
  Scenario: verify coffee creation updating and deletion of coffee
    Given I create a "hot" coffee
      |title    |description |ingredients  |image          |id            |
      |hotCoffee|coffee500021| powder,suger|coffeeImg      |1122331     |

    Then I verify response status as 201
    And I verify response time is less then 5000 ms
    When I Update coffee title to "Touheed_BlackCoffee1"
    Then I verify response status as 200
    When I delete a created coffee
    Then I verify response status as 200
    And I verify the coffee is deleted
    Then I verify response status as 404
