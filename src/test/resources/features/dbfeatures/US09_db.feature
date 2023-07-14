Feature: US 09 DataBase Test

  Scenario: Kullanicinin DB'den gelen tum hasta bilgilerini dogrulamalidir.

    Given Staff connection baglantisini yapar
    Then  Staff hasta bilgilerini request yapar
    And Staff hasta bilgilerini dogrular