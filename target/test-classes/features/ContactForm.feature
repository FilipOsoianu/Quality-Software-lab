Feature: Check sign up functionality

  Scenario Outline: Check form
    Given Open site "<url>"

    And Click on contact
    And Input value in form "<name>" "<email>" "<subject>" "<messaje>"
    And Click on send
    Then SendForm "<url>"
    Examples:
      | url                                        | name   | email               | subject/messaje |
      | https://adoring-pasteur-3ae17d.netlify.app | jora   | jora@jora.com       | qwerty/d45678   |
      | https://adoring-pasteur-3ae17d.netlify.app | joraik | jordadadaa@jora.com | qwerty/qwerty   |