# Metro-cucumber

This Automation Project implements Cucumber with Junit in a Maven Project.<br/>
This Arch is Page Object Model and there are two Object Pages:<br/>
Home Page and Cart Page, where the iteraccion with the Weblements is performed.<br/>

## The Feature is described in the file Metro.feature:

>Feature: Add product to the shopping cart<br/>
  As a User of the Metro Webpage<br/>
  I want to search any product<br/>
  and add that product to the shopping cart<br/>
  Scenario: User adds a product to the shopping cart<br/>
    Given The users enters to the Metro page<br/>
    When  The user searches a 'Play Station 4'<br/>
    And   The users adds the item to the shopping cart<br/>
    Then  The product is added successfully<br/>
    
The item searched in this case 'Play Station 4' can be replaced for any Metro Product.<br/>
For Run this Project, you can do a ```Maven Test```.<br/>
