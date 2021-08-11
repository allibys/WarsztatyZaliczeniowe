Feature: Create new address

  Scenario Outline: user can create new address on online store
    Given an open browser with https://prod-kurs.coderslab.pl/index.php
    When user clicks button Sign in
    And fill field Email with value anna.testerska1@test.pl
    And fill field Password with value coderslab
    And click button Sign In
    And click link Addresses on page's footer
    And click link Create new address
    And fill form with Alias <alias>, Address <address>, City <city>, Zip/Postal Code <code>, Country <country>, Phone <phone>
    And click button Save
    Then will see message Address successfully added!
    And see added address with data <alias>, Anna Testerska, <address>, <city>, <code>, <country>, <phone>
    And click Delete button
    And will see message Address successfully deleted!

    Examples:
      | alias  | address   | city   | code   | country        | phone
      | Adres1 | Testowa 1 | Kraków | 31-317 | United Kingdom | 661662663
