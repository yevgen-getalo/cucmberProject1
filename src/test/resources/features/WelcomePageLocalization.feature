Feature: In this feature I'm testing WELCOME page's localization
  Background:
    Given Welcome page

  Scenario: Check Italian localization
    When Select "2" ITALIANO language
    Then Page must be restarted in Italiano language
         |WELCOME|PRODOTTI|OFFERTE SPECIALI|BLOGS|CONTATTACI|
    Then Page must be restarted in Italiano language footer
      |WELCOME|PRODOTTI|OFFERTE SPECIALI|BLOGS|CONTATTACI|

  Scenario: Check Ukrainian localization
    When Select "3" українська language
    Then Page must be restarted in Ukrainian language
      |WELCOME|ПРОДУКТИ|ОСОБЛИВІ ПРОПОЗИЦІЇ|БЛОГИ|ЗВ'ЯЗАТИСЯ З НАМИ|
    Then Page must be restarted in Ukrainian language footer
      |WELCOME|ПРОДУКТИ|ОСОБЛИВІ ПРОПОЗИЦІЇ|БЛОГИ|ЗВ'ЯЗАТИСЯ З НАМИ|

  Scenario: Check Russian localization
    When Select "4" русский language
    Then Page must be restarted in Russian language
      |WELCOME|ПРОДУКТЫ|СПЕЦИАЛЬНЫЕ ПРЕДЛОЖЕНИЯ|БЛОГИ|ОБРАТНАЯ СВЯЗЬ|
    Then Page must be restarted in Russian language footer
      |WELCOME|ПРОДУКТЫ|СПЕЦИАЛЬНЫЕ ПРЕДЛОЖЕНИЯ|БЛОГИ|ОБРАТНАЯ СВЯЗЬ|

  Scenario: Check English localization
    When Select "1" English language
    Then Page must be restarted in English language
      |WELCOME|PRODUCTS|SPECIAL OFFERS|BLOGS|CONTACT US|
    Then Page must be restarted in English language footer
      |WELCOME|PRODUCTS|SPECIAL OFFERS|BLOGS|CONTACT US|


