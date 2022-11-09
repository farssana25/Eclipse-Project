Feature: To test Facebook

  @fblaunch @launch
  Scenario Outline: To launch Facebook
    Given Facebook website is launched
    When username bar is visible
    And enter username "<username>"
    When Password bar is visible
    And enter password "<password>"
    Then close the facebook page

    Examples: 
      | username |  | password |
      | farz     |  | pass     |
      | farzu    |  | password |
      | farzsulf |  | farzu    |
