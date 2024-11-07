Feature: serach and place the order for products
  I want to use this template for my feature file

  @PlaceOrder
  Scenario Outline: Search product match for both home page and offer page
    Given User is on GreenCart Homepage
    When User search for product with shortname "<Name>" and extracted actual name of product
  
 And added "5" items of the selected product to cart
    Then User proceeds to checkout and validate the "<Name>"  items in checkout page
    And user has ability to enter promo code and place the order
    
    
    
    Examples:
    |Name|
    |Tom|
    |Car|
 
