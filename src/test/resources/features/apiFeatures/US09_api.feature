Feature: US 009 "Staff (Personel),
  Hasta bilgilerini görebilmeli, düzenleyebilmeli ve silebilmelidir."

  Scenario: Kullanici, API kullanarak  hastanin tum bilgilerini dogrulamalidir.
    Given Staff Medunna Url i id ile ayarlar
    Then Staff GET request yapar ve response alir
    And Staff json datayi deserialize yaparak javaya dondurur
    And Staff randevulari API ile dogrular
