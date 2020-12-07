Feature: Check google seach

  Scenario: Check google page is opening or not after entering
    When Open "https://www.google.co.in"
    Then Open google page

  Scenario: Check how many results display on a single page
    Given Google page is opened
    When Input in search "java"
    And Click enter
    Then Present list of 10 search result

  Scenario: Check empty search
    Given Google page is opened
    And Click enter
    Then Nothing happens

  Scenario: Verify wrong input
    Given Google page is opened
    When Input in search "googne"
    And Click enter
    Then Correct search "google" appears
