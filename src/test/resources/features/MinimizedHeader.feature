Feature: In this feature I'm testing minimized header from PRODUCTS page
  Background:
    Given Products page

  Scenario Outline: Check the transition to different pages
    When Click on <page's name>
    Then Must be transition to <target> page
    Examples:
    |page's name|target|
    |Welcome    |http://192.168.214.3:8080/welcome|
    |Special Offers|http://192.168.214.3:8080/special-offers|
    |Blogs         |http://192.168.214.3:8080/blogs         |
    |Contact Us    |http://192.168.214.3:8080/contact-us    |

  Scenario Outline: Check select language button and sign in button
    When click on the <button> in header
    Then Must be appeared <aims>
    Examples:
    |button|aims|
    |aui-field-select||
    |login           |/login/login?saveLastPath=false|




