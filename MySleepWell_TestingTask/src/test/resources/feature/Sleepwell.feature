@P1
Feature: Testing task for mysleepwell functionality

  Scenario: Customer is able to select city for local pricing
    Given I open login page of mysleepwell website
    When I select "AGRA (U.P.)" city for local pricing
    Then I should see "AGRA (U.P.)" city in header

  Scenario: Customer login to sleepwell successfully
    Given I open login page of mysleepwell website
    And I select "AGRA (U.P.)" city for local pricing
    When I login with valid username and password
    Then I should see my account page

  Scenario: Customer is able to sign up successfully
    Given I open login page of mysleepwell website
    And I select "AGRA (U.P.)" city for local pricing
    When I sign up with sleepwell
    Then I should see my account page






