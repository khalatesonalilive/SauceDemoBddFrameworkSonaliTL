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

  Scenario: Test Your Cart Functionality
    Given user is on Your Cart Page and validate  Your cart Page URL
    And user click on Checkout button

  Scenario: Test Checkout Information Functionality
    Given user is on Checkout page and validate checkOut Page Url
    When user enters valid firstname, lastname and postalcode
    Then user click on continue button

  Scenario: Test CheckoutOverviewPage Functionality
    Given user is on checkoutOverview Page and click on Finish button

  Scenario: Test CheckoutComplete Page Functionality
    Given user capture the checkoutcomplete msg
