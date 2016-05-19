Feature: In this feature I'm testing PRODUCTS page
  Background:
    Given Products page

  Scenario: Check transition using breadcrumbs container
    When Click with LMB on first category in categories list
    And Click with LMB on the previous breadcrumb-truncate
    Then Must be transition to the "PRODUCTS" page

  Scenario: Check the transition to the produc's category from current product's page using breadcrumb link
    When Click with LMB on the "Calamari Rings" name link
    And Click on the previous breadcrumb-truncate
    Then Must be transition to "SPECIAL OFFER" page

  Scenario: Check the search from "PRODUCTS" page with filled search field
    When Type the word "soy" into the search field and press search button
    Then Then Check open page that contains "soy" in search field
    Then in field of search category must be "Products" scope
    Then Must be present the list of products that contain "Soy"

  Scenario: Check the search scope
    When Type the  word "soy" into the search field and press search button
    When select "Global"
    When Click search button

  Scenario: Check grid-view trigger
    When Click with LMB on the "grid" view trigger button
    Then Page must reload and all images of products must displayed in grid with three columns
    When Click with LMB on the "list" view  trigger button
    Then Page must reload and all images of products must displayed in list

  Scenario Outline: Check transition to product page by clicking on the first product's image, item link and more button
    When Click with LMB on the <first product> in the list
    Then Must be opened current product page
       Examples:
       |first product|
       |1            |
       |2            |

  Scenario Outline: Check social pages
    When Must <image link> transition to <target> page in new window
    Examples:
      |image link|target|
      |vkontakte |vk.com|
      |twitter   |twitter|
      |linkedin  |linkedin|
      |pinterest |pinterest|
      |gplus     |plus.google|
      |facebook  |facebook|

