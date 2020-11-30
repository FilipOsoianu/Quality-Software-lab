Feature: Check sign in functionality

  Scenario Outline: Check sign in
    Given Open web site "<url>"

    And Click on Sign In header button
    And Input "<name>" "<email>"
    And Click on Sign In button
    Then User login "<url>"
    Examples:
      | url                                        | name   | email               |
      | https://adoring-pasteur-3ae17d.netlify.app | jora   | jora@jora.com       |
      | https://adoring-pasteur-3ae17d.netlify.app | joraik | jordadadaa@jora.com |