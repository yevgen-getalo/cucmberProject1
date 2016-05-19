Feature: In this feature I'm testing Welcome page
Background:
  Given Welcome page

  Scenario: Check "OUR SPECIAL OFFERS" image carousel spinning to the right
    When Scroll images in carousel with holding LMB and move to the right two times
    Then Images in carousel must spin in a circle to the right by mouse

  Scenario: Check "OUR SPECIAL OFFERS" image carousel spinning to the left
    When Scroll images in carousel with holding LMB and move to the left two times
    Then Images in carousel must spin in a circle to the left by mouse

  Scenario: Check the ">" button for the image carousel
    When Click with LMB on the > button
    Then Images in carousel must spin in a circle to the right

  Scenario: Check the "<" button for the image carousel
    When Click with LMB on the < button
    Then Images in carousel must spin in a circle to the left

  Scenario: Check the transition by clicking the first product's item name link
    When Hover the mouse pointer over the first image of the product and click the item name link with LMB
    Then open link "http://192.168.214.3:8080/special-offers/-/product/category/special-offer/get-entity/154"
    Then name of this product "Strawberries"
    Then navigation tag link "Strawberries"

  Scenario: Check the transition by clicking first image link in product categories list slider
    When Hover the mouse pointer over the first image of the category and click
    Then open page "http://development.ict4apps.aimprosoft.com/products/-/category/appetize-1"

  Scenario: Check the transition by clicking eighy image link in product categories list slider
    When Click next button
    When Hover the mouse pointer over the eight image of the category and click
    Then check open page "http://development.ict4apps.aimprosoft.com/products/-/category/kids-menu"

  Scenario: Check first blog's link
    When Click with LMB on the text link of the first blog's link in the list
    Then check open page that contains "http://192.168.214.3:8080/welcome/-/asset_publisher/FdNrpnFe314s/blog/"

  Scenario: Check fifth blog's link
    When Click with LMB on the text link of the fifth blog's link in the list
    Then Check open page that contains "http://192.168.214.3:8080/welcome/-/asset_publisher/FdNrpnFe314s/blog/"

  Scenario: Check search with filled searching field
    When Type the word "orange", click on the SEARCH button with LMB
    Then Check open page that contains "orange" in search field
    Then in field of search category sets "Global" scope

  Scenario: Check "SEARCH" button
    When click on the SEARCH button with LMB
    Then Check open page that contains empty "" in search field
    Then in field of search category must be displayed "Global" scope

  Scenario: Check "Read more About us" text link
    When Click with LMB on the Read more About Us link
    Then Must be opened page with name "Read More About Us"

  Scenario: Check back-to-top button
    When Scroll to the bottom of the page using scroll bar and click Up button






