Feature: Perform facebook smoke
  Scenario: Login to facebook with valid credentials
    Given I am on facebook homepage
    When I enter my valid credentials
    Then I should be logged in successfully
