Feature: Create product
  As a user I want to create a product.

  Scenario: All field empty
    Given I am in the page to create a new product
    When I click the Create button
    And all the fields are empty
    Then the page shouldn't let me continue
    And show an error "Fields can not be empty"