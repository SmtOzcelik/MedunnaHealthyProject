@Register

Feature: Register

  Background:

    Given Kullanici url'e gider
    When  Kullanici register simgesine tiklar
    Then  Kullanici register'a tiklar
    And   Kullanici gecerli bir SSN girer
    And   Kullanici gecerli bir First Name girer
    And   Kullanici gecerli bir last name girer
    And   Kullanici gecerli bir username girer
    And   Kullanici gecerli bir e-mail girer

  Scenario: 7 haneli guclu password girme

    And   Kullanici sifre kismina "aaaaaaa" girer
    And   Kullanici password strenght seviyesinin degistigini kontrol eder
    And   Kullanici second password kismina "aaaaaaa" girer

  Scenario: 7 haneli guclu password girme

    And   Kullanici sifre kismina "Aaaaaaa" girer
    And   Kullanici password strenght seviyesinin degistigini kontrol eder two
    And   Kullanici second password kismina "Aaaaaaa" girer

  Scenario: 7 haneli guclu password girme

    And   Kullanici sifre kismina "Aa1aaaa" girer
    And   Kullanici password strenght seviyesinin degistigini kontrol eder three
    And   Kullanici second password kismina "Aa1aaaa" girer

  Scenario: 7 haneli guclu password girme

    And   Kullanici sifre kismina "Aa1,aaa" girer
    And   Kullanici password strenght seviyesinin degistigini kontrol eder four
    And   Kullanici second password kismina "Aa1,aaa" girer
    And   Kullanici sayfayi kapatir