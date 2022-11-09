Feature: To test elearning website

  Scenario: To test edit profile functionality
    Given user launch elearning URL
    And user click on sign up link
    When user fill up all the mandotory fields
    And user click on register button
    And user verify next button in visible
    And user click on next button
    Then user click on name dropdown
    And user click on profile
    And user click on edit profile
    And user edit first name and last name and add phone details
    And click on save settings