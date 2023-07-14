Feature:  US007 Database Dogrulama

  Scenario: US007 Database ile randevular dogrular

    Given DKullanici database baglanir
    And   DKullanici randevu tablosundan verileri alir
    Then  DKullanici aldigi bilgileri dogrular
    And   DKullanici database baglantisini kapatir