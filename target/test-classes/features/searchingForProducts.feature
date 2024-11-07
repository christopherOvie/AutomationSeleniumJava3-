Feature: serach and place the order for products
  I want to use this template for my feature file

  @OfferPage
  Scenario Outline: Search product match for both home page and offer page
    Given User is on GreenCart Homepage
    When User search for product with shortname "<Name>" and extracted actual name of product
  
 
    Then User searched for same shortname "<Name>" in offers page 
    Then user validate product name matches with landing page
    
    
    
    Examples:
    |Name|
    |Tom|
  #  |Beet|
    |Car|
