@US10
Feature: US_10  Doktor (Physician) randevulari

  Scenario: TC001 "Doktor, randevu listesini ve zaman dilimlerini ""My Appointments"" sekmesinden görebilmelidir."

    Given Dr.Url adresine gider
    Then Dr. Kullanici bilgi sekmesini tiklar
    Then Dr. Login islemini gerceklestirir
    And Dr. MY PAGES sekmesini tiklar
    And Dr. My Appointments sekmesine tiklar
    And Dr.kendi hastalarinin listesini gorur
    And Dr. Kendine tanimlanan zaman dilimlerini gorur
    And Dr.sayfayi kapatir


  Scenario: TC002 Doktor "patient id, start date, end date, status" bilgilerini gorebilmeli
    Given Dr.Url adresine gider
    Then Dr. Kullanici bilgi sekmesini tiklar
    Then Dr. Login islemini gerceklestirir
    And Dr. MY PAGES sekmesini tiklar
    And Dr. My Appointments sekmesine tiklar
    And Dr. patient id, start date, end date, status bilgilerini goruntuler
    And Dr.sayfayi kapatir



















