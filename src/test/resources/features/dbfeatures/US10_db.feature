@US10DB
Feature: US10 Database Test

  Scenario: TC001 DB ile randevulari dogrulama

    Given Kullanici connection baglantisini yapar
    Then  Kullanici hasta bilgilerini request yapar
    And Kullanici hasta bilgilerini dogrular