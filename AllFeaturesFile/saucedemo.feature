Feature: Test Sauce Demo Application

  Scenario: Test Login Page Functionality
    Given user is on Login Page
    When user enters a valid username and password
    And user click on Login button
