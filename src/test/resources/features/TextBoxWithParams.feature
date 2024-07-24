Feature: Text Box With Parameters

  @params
  Scenario: Fill up the text box page with params
    Given user is on text box page
    When user  fill up  fullName "John Snow"
    And user should fill up email "john@gmail.com"
    And user should fill up  current address "someAddress112"
    And user should fill up  permanent address "somePermanentAddress112"
    When user click  on submit button
    Then user should see "John Snow"
    And user age is 123


  @params
  Scenario: Fill up the text box page with invalid params
    Given user is on text box page
    When user  fill up  fullName "fdsfs#$"
    And user should fill up email "john@#@#@gmail.com"
    And user should fill up  current address "#2412"
    And user should fill up  permanent address "somePermanentAewqeqwddress112"
    When user click  on submit button
    Then user should see "ewqeqw321 Snow"
    And user age is 123