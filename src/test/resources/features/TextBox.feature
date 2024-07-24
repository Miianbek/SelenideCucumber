Feature: Text Box

@smoke
  Scenario: Fill up Text box page  with valid data
    Given user is on text box page
    When user  fill up  fullName input field  with valid data
    And user should fill up email field with valid email
    And user should fill up  current address with valid addres
    And user should fill up  permanent address with valid addres
    When user click  on submit button
    Then user should see the result
@smoke
  Scenario: Fill up Text box page  with invalid data
    Given user is on text box page
    When user  fill up  fullName input field  with valid data
    And user should fill up email field with invalid email
    And user should fill up  current address with valid addres
    And user should fill up  permanent address with valid addres
    When user click  on submit button
    Then user should see the result