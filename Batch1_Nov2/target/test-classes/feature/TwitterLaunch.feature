Feature: To test Twitter

  Scenario Outline: To launch Twitter
    Given Twitter website is launched
    When Twitter username bar is visible
    And enter Twitter username "<username>"
    When Next button is visible
    And click on Next button
    When Twitter Password bar is visible
    And enter Twiter password "<password>"
    Then close the twitter page

    Examples: 
      | username |  | password |
      | farz     |  | pass     |
      | farzu    |  | password |
      