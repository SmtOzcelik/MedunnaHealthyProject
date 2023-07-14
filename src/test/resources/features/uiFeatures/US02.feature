@Register

Feature: Register

  Background:

    Given Kullanici url'e gider
    When  Kullanici register simgesine tiklar
    Then  Kullanici register'a tiklar
    And   Kullanici gecerli bir SSN girer
    And   Kullanici gecerli bir First Name girer
    And   Kullanici gecerli bir last name girer

  Scenario: User name girisi negatif test

    And   Kullanici bos bir username girer
    And   Kullanici Your username is required. uyarisinin gorundugunu test eder

  Scenario: User name girisi pozitif test

    Given Kullanici gecerli bir username girer

  Scenario: Email girisi negatif test

    Given Kullanici gecerli bir username girer
    When  Kullanici @ ve . karakterleri olmadan e-mail girer
    Then  Kullanici This field is invalid uyarisinin gorundugunu test eder

  Scenario: Email girisi negatif test

    Given Kullanici gecerli bir username girer
    When  Kullanici bos bir e-mail girer
    Then  Kullanici This field is invalid uyarisinin gorundugunu test eder

  Scenario: Email girisi pozitif test

    Given Kullanici gecerli bir username girer
    When  Kullanici @ ve . karakterlerini iceren gecerli bir e-mail girer


