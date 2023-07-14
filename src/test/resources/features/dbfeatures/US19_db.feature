#@DB019
Feature:US019 Yeni Staff (Personel) Goruntulemeli

  Scenario:TC01 Kullanici US19 Staff DB deki staff bilgilerini okuyabilmelidir
    Given KullaniciAbd database baglanir
    When KullaniciAbd "*" "staff" ile "id" tablosundan "381899" alir
    Then KullaniciAbd "first_name" "personel" olmalidir
    And KullaniciAbd database baglantisini kapatir