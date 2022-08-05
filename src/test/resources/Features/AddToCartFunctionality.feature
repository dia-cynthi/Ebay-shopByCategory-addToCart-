Feature: EBay Add To Cart Funtionality

  @sanity @chrome
  Scenario: The user should be able to add item to cart
    Given User is on itemsPage
    When User clicks on addToCartButton
    And User should see item addedToCart
    Then User shuold able to find the item in shoppingCart
