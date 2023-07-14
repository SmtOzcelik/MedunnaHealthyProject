@US07A
Feature: US007A

  Scenario: Gecerli tarih Dogrulama
    Given Kullanici url'e gider
    When Kullanici MakeAnAppointment butonuna a tiklar.
    And Kullanici gecerlii bir tarih girer
    And Kullanici gecerli bir firstName girer
    And Kullanici gecerli bir lastName girer
    And Kullanici gecerli bir SSN i girer
    And Kullanici gecerli bir Phone i girer
    And Kullanici gecerli bir email i girer

    And Kullanici SendAnAppointmentRequest butonuna tiklar

