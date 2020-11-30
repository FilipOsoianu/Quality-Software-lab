Feature: Check search functionality

  Scenario Outline: Check search
    Given Open webpage "<url>"

    And Input "<searchValue>"
    And Click on Sign Un button
    Then search "<url>"
    Examples:
      | url                                        | searchValue |
      | https://adoring-pasteur-3ae17d.netlify.app | bag         |
      | https://adoring-pasteur-3ae17d.netlify.app | card        |