Feature: US25 My Appointments by Patient in the account
  Scenario: TC001 Hasta portalini kullanarak yeni bir randevu alabilir
   Given Kullanici url adresine gider.
   When Kullanici bilgi sekmesine tiklanir.
   Then Kullanici sing in sekmesine tiklar.
   Then Kullanici username i girer.
   And Kullanici password u girer.
   And Kullanici sing in buttonuna basar.
   And Kullanici MY PAGES a tiklar.
   And Kullanici Make an Appointment a tiklar.
   And Kullanici First Name, Last Name, SSN, Email, Phone, Appointment DateTime bilgilerini girer.
   And Kullanici Send an Appointment Request butonuna tiklar.
   And Kullanici sayfayi kapatir.


   Scenario: TC002 Hasta portalini kullanmadan yeni bir randevu alabilir.
    Given Kullanici url adresine gider.
   When Kullanici  Make an Appointment a tiklar.
   Then Kullanici First Name, Last Name, SSN, Email, Phone, Appointment DateTime bilgilerini girer.
   And Kullanici Send an Appointment Request butonuna tiklar.
    And Kullanici sayfayi kapatir.