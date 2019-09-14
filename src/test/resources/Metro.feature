Feature: Add product to the shopping cart
  As a User of the Metro Webpage
  I want to search any product
  and add that product to the shopping cart
  Scenario: User adds a product to the shopping cart
    Given The users enters to the Metro page
    When  The user searches a 'Play Station 4'
    And   The users adds the item to the shopping cart
    Then  The product is added successfully