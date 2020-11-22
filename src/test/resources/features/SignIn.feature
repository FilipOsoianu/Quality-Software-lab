Feature: Check sign in functionality

  Background: User open web site
    Given Open web site

  Scenario: Check sign in
    And Click on Sign In header button
    And Input name
    And Input email
    And Click on Sign In button
    Then User login