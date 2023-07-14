@Register

Feature: Register

  Background:

    Given Kullanici url'e gider
    When  Kullanici register simgesine tiklar
    Then  Kullanici register'a tiklar

  Scenario: SSN girisi negatif test

    And   Kullanici "-" icermeyen bir SSN girer
    And   Kullanici Your SSN is invalid uyarisini gorur


  Scenario: SSN girisi negatif test

    And   Kullanici dokuz haneli olmayan bir SSN girer
    And   Kullanici Your SSN is invalid uyarisini gorur

  Scenario: SSN girisi negatif test

    And   Kullanici rakamlardan olusmayan bir SSN girer
    And   Kullanici Your SSN is invalid uyarisini gorur

  Scenario: SSN girisi negatif test

    And   Kullanici bos bir SSN girer
    And   Kullanici Your SSN is invalid uyarisini gorur

  Scenario: SSN girisi pozitif test

    And   Kullanici gecerli bir SSN girer


  Scenario: First name girisi negatif test

    Given Kullanici gecerli bir SSN girer
    When  Kullanici bos bir First Name girer
    Then  Kullanici Your FirstName is required. uyarisini gorur

  Scenario: First name girisi pozitif test

    Given Kullanici gecerli bir SSN girer
    When  Kullanici gecerli bir First Name girer

  Scenario: Last name girisi negatif test

    Given Kullanici gecerli bir SSN girer
    When  Kullanici gecerli bir First Name girer
    Then  Kullanici bos bir last name girer
    And   Kullanici Your LastName is required. uyarisinin gorundugunu test eder

  Scenario: Last name girisi pozitif test

    Given Kullanici gecerli bir SSN girer
    When  Kullanici gecerli bir First Name girer
    Then  Kullanici gecerli bir last name girer




