Feature: Test Sauce Demo Application

  Scenario: Test Login Page Functionality
    Given user is on Login Page
    When user enters a valid username and password
    And user click on Login button

  Scenario: Test HomePage Functionality
    Given user is on Home Page and Validate the HomePage Title
    And user validate Home Page URL
    And user click on Sauce Labs Backpack and Sauce Labs Bike Light
    Then user click on shopping cart button
