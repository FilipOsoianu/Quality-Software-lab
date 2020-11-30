Feature: Check sign up functionality

  Scenario Outline: Check sign up
    Given Open web "<url>"

    And Click on Sign Un header button
    And Input "<name>" "<email>" "<password>" "<confirmPassword>"
    And Click on Sign Un button
    Then User register "<url>"
    Examples:
      | url                                        | name   | email               | password/confirmPassword/
      | https://adoring-pasteur-3ae17d.netlify.app | jora   | jora@jora.com       | qwert/qwert
      | https://adoring-pasteur-3ae17d.netlify.app | joraik | jordadadaa@jora.com | qwerty/qwerty