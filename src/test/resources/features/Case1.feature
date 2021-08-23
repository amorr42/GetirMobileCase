Feature: Getir Mobile Testing

  @regression
  Scenario: First Scenario
    #Given User should pass onboarding screens
    And   User checks if home page exists or not
    And   User changes category to Baby Care
    And   User open a random product detail
    Then  User adds this product to basket and return last page
    And   User changes category to Snacks
    And   User open a random product detaill
		Then  User adds this product to basket and return last pagel
		And   User goes to basket and control added products and prices
		And   User should deletes all products from basket and makes controls
