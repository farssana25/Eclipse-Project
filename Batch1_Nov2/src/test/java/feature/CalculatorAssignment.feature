Feature: To test BMI Calculator

  @RegressionTesting
  Scenario Outline: To get the BMI Result Value
    Given user launch BMI Calculator URL
    And user validate title of the current page
    When user click on BMI Calculator
    And user validate title of the current page again
    And user enters "<age>" "<height>" and "<weight>"
    Then User click on Calculate button
    And user gets the BMI result value
    And user close the browser

    Examples: 
      | age | height | weight |
      |  10 |    127 |     40 |
      |  30 |    156 |     70 |
      |  25 |    152 |     55 |
      |  20 |    160 |     45 |
      |  35 |    160 |     70 |
