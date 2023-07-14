@US13
Feature: US13 Staff,Doktor test sonuc islemlerini yapabilmeli

  Scenario: TC001 Staff test sonuclarini gorebilmeli,guncelleyebilmeli

    Given Staff Url adresine gider
    Then  Kullanici girisine tiklar
    And   Staff Login islemini gerceklestirir
    And   Staff,My Pages sekmesi altinda Search Patient e tiklar
    And   Staff,SSN numarasini girerek hastayi goruntuler
    And   Staff,Show Appointments butonuna tiklar
    And   Staff,Show Tests butonuna tiklar
    And   Staff,View Results butonuna tiklar
    And   Staff,Edit butonuna tiklar
    And   Staff cikan sayfada test sonucunu girer
    And   Staff save butonuna tiklayarak test sonucunu kaydeder
    And   Staff sayfayi kapatir

 Scenario: Doctor test sonuclarini gorebilmeli, hasta yatıs isteginde bulunabilmeli

   Given Doctor Url adresine gider
   Then  Doctor Kullanici girisine tiklar
   And   Doctor Login islemini gerceklestirir
   And   Doktor my appointments a tiklar
   And   Doktor edit e tiklar
   And   Doktor show test results a tiklar
   And   Doktor test sonuclarini gordugunu dogrular
   And   Doktor Request Impatient a tiklayabilir (hastanin yatili tedavi gormesi) isteginde bulunabilmelidir.

