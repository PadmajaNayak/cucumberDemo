
Feature: verify login

Scenario: verify login is successful

    Given I login to the application
    When I enter valid name "admin"
    And I enter valid password "admin123"
    And I click on submit button
    Then I should see username as "Welcome Paul"
