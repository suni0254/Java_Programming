Feature: Books selection Functionality

  Background: Login in to page
    Given Login in to homepage
    When enters username
    And enter the password
    Then click on login button
    And verify the title on homepage

  @smoke
  Scenario: Sort books by price and add a book to the cart
    Given the user navigates to the Books section
    When the user selects "Price: Low to High" from the Sort By dropdown
    And the user selects a value from the Display dropdown
    And the user selects "List" from the View dropdown
    And the user presses page down
    Then the user adds a selected book to the cart
    And the user click on the shoppingcart
    And the open the shoppingcartpage and click on check button
    When the user click on the shoppingcart
    Then the user click on the logoutbutton
