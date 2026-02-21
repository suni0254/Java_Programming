Feature: Login Functionality

  Scenario: Login in to page
    Given Login in to homepage
    When enters username
    And enter the password
    And click on login button
    Then  verify the title on homepage