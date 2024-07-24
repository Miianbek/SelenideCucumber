@background
Feature: background


Background: Login to system
  Given user is on login page
  When user should enter login "Admin"
  And  user should enter password "admin123"
  And user click on login button
  Then user should successfully logged in


  Scenario: Register new user

    And say Hello

  Scenario: Register new user1

    And say bye bye

  Scenario: Register new user2

    And say not hello