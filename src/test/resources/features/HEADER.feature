Feature: In this feature I'm testing transition to pages from header
Background:
  Given Welcome page
  Scenario: Check the transition to the page using the PRODUCTS link
    When click on the "Products" link
    Then Must be present URL"http://192.168.214.3:8080/products"
    Then Page's name Products
    Then Categories list
    Then Products list

  Scenario: Check the transition to the page using the SPECIAL OFFERS link
    When click on the Special offers link
    Then Must be present SP URL"http://192.168.214.3:8080/special-offers"
    Then Page's name Special Offers
    Then SP Products list
    Then Pagination block
    Then SP label

  Scenario: Check the transition to the page using the BLOGS link
    When click on the Blogs link
    Then Must be present Blogs URL"http://192.168.214.3:8080/blogs"
    Then Page's name Blogs
    Then Blogs news list
    Then Bottom pagination block

  Scenario: Check the transition to the page using the CONTACT US link
    When click on the Contact us link
    Then Must be present Contact us URL"http://192.168.214.3:8080/contact-us"
    Then Page's name Contact Us
    Then Google Map
    Then Contact details
    Then Additional information

  Scenario: Check the transition to the Google Play
    When click on the Google play image link
    Then Must be opened Google play page with URL"https://play.google.com/store/apps/details?id=com.ict4apps.demo"

  Scenario: Check the transition to the App Store
    When click on the App store image link
    Then Must be opened App store page with URL"https://itunes.apple.com/us/app/ict4apps-series-basic/id913949563?l=ru&ls=1&mt=8"



