Feature: Sign-up feature
  This feature is about creating new acc in the system

  Scenario: Successfull sign-up
    Given I have opened homepage
    When I select my account menu
      And I select Sign up button
      And I enter First name
      And I enter Last name
      And I enter Mobile number
      And I enter Email address
      And I enter Password
      And I confirm Password
      And I select Sign up button
    Then user account page is opened

  Scenario: Unsuccessfull sign-up
    Given I have opened homepage
    When I select my account menu
      And I select Sign up button
      And I select Sign up button
    Then user account page is opened