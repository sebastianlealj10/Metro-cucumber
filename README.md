# Metro-cucumber

This Automation Project implements Cucumber with Junit in a Maven Project.
The Architecture choosed was Page Object Model and there are two pages:
Home Page and Cart Page, where the iteraccion with the Weblements is performed.

The Feature is described in the Metro.feature:

Feature: Add product to the shopping cart
  As a User of the Metro Webpage
  I want to search any product
  and add that product to the shopping cart
  Scenario: User adds a product to the shopping cart
    Given The users enters to the Metro page
    When  The user searches a 'Play Station 4'
    And   The users adds the item to the shopping cart
    Then  The product is added successfully
    
The item searched in this case 'Play Station 4' can be replaced for any Metro Product.
For Run this Project, you can do a 'Maven Test'. 
