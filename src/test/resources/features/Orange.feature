Feature: Login

  Background: Login to Orange system
    Given  user is on login page
@login
    Scenario: Login to Orange
      When user should enter login "Admin"
      And user should enter password "admin123"
      And user click on login button
      Then user should successfully logged in