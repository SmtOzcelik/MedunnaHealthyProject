@US17
Feature: US17 Admin test items olusturur gunceller siler

  Scenario: Admin yeni test ogeleri olusrurur

  Given Admin Url adresine gider
  Then  Admin kullanici girisine tiklar
  And   Admin Login islemini gerceklestirir
  And   Items-Titles butonuna tiklar
  And   Test item secenegini secer
  And   Create new item butonuna tiklar
  And   Name ogesi olusturur
  And   Descripion ogesi oluturur
  And   Price ogesi olusturur
  And   Default Min Value ogesi olusturur
  And   Default Max Value ogesi olusturur
  And   Created Date ogesi olusturur
  And   Sayfayi kapatir



  Scenario: Admin test ogelerini gunceller

    Given Admin Url adresine gider
    Then  Admin kullanici girisine tiklar
    And   Admin Login islemini gerceklestirir
    And   Items-Titles butonuna tiklar
    And   Test item secenegini secer
    And   Edit butonuna tiklar
    And   Name ogesini gunceller
    And   Description ogesini gunceller
    And   Price ogesini gunceller
    And   Default Min Value ogesini gunceller
    And   Default Max Value ogesini gunceller
    And   Created Date ogesini gunceller
    And   Default Min Value ogesini gunceller
    And   Default Max Value ogesini gunceller
    And   Created Date ogesini gunceller
    And   Guncellemeleri kaydeder
    And   Sayfayi kapatir

  Scenario: Admin test ogelerini goruntuler siler

    Given Admin Url adresine gider
    Then  Admin kullanici girisine tiklar
    And   Admin Login islemini gerceklestirir
    And   Items-Titles butonuna tiklar
    And   Test item secenegini secer
    And   Test ogelerini goruntuler
    And   Delete butonuna tiklar
    And   itemlari sildigini dogrular


