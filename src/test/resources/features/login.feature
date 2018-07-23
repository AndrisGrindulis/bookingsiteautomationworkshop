Feature: Login feature
  This feature is about login in existing account

  Scenario: Successfull login
    Given I have opened homepage
    When I select my account menu
    And I select Login button
    And I enter Email address
    And I enter Password
    And I select Login button
    Then user account page is opened

  Scenario: Unsuccessfull login
    Given I have opened homepage
    When I select my account menu
    And I select Login button
    And I select Login button
    Then user account page is opened