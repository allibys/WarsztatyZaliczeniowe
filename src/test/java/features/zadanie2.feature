Feature: Implementation of the purchasing process


  Scenario: user can purchase a sweater

    Given an open browser with https://prod-kurs.coderslab.pl/index.php
    When user clicks button Sign in
    And fill field Email with value anna.testerska1@test.pl
    And fill field Password with value coderslab
    And click button Sign In
    And go to the page https://prod-kurs.coderslab.pl/index.php
    And click on the product: Hummingbird Printed Sweater
    And choose size M
    And choose 5 items of this size
    And add this product to the basket by clicking Add to cart
    And click button Proceed to checkout on the pop-up
    And click button Proceed to checkout in the basket
    And see selected address with data Anna Testerska, Testowa 1, Kraków, 31-317, United Kingdom, 661662663
    And click button Continue on address element
    And choose method of receipt PrestaShop pick up in store
    And click button Continue on shipping method
    And choose payment method Pay by check
    And select the checkbox I agree to the terms of service and will adhere to them unconditionally.
    And click button Order with an obligation to pay
    Then will see messages YOUR ORDER IS CONFIRMED
    And take a screenshot
    And close browser
















