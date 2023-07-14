Feature: US21 Staff hastalar için randevuları görür

  Background: Login islemi
    Given Staff, Url adresine gider
    When Staff, Sign in butonuna tiklar..
    Then Staff, Sign in islemini gerceklestirir.


  Scenario: TC01 Staff sadece randevuları güncelleyebilir.

    Given Staff , My Pages basligindaki Search Patient butonunu tiklar
    When Staff , SSN kutucuguna veri girerek hasta aratir
    Then Staff , View,Edit ve Show Appointment butonlarini goruntuler
    And Sayfayi Kapat..

  Scenario: TC02 Staff hasta durumunu (status) "UNAPPROVED, PENDING veya CANCELLED" yapabilmeli ancak "COMPLETED" yapamamali.

    Given Staff , My Pages basligindaki Search Patient butonunu tiklar
    When Staff , SSN kutucuguna veri girerek hasta aratir
    Then Staff , View,Edit ve Show Appointment butonlarini goruntuler
    And Staff , Show Appointment butonunu tiklar
    And Staff , Edit butonunu tiklar
    And Staff , Status da UNAPPROVED seceneginin oldugunu dogrular
    And Staff , Status da PENDING seceneginin oldugunu dogrular
    And Staff , Status da COMPLETED seceneginin olmadigini dogrular
    And Staff , Status da CANCELLED seceneginin oldugunu dogrular
    And Sayfayi Kapat..

  Scenario: TC03 Staff "Anamnesis (Hastalık Geçmişi), Treatment ( Tedavi) veya Diagnosis(Teşhis)" kısımlarına data girememeli.

    Given Staff , My Pages basligindaki Search Patient butonunu tiklar
    When Staff , SSN kutucuguna veri girerek hasta aratir
    Then Staff , View,Edit ve Show Appointment butonlarini goruntuler
    And Staff , Show Appointment butonunu tiklar
    And Staff , Edit butonunu tiklar
    And Staff , Anamnesis kutucuguna veri girilemedigini dogrular
    And Staff , Treatment kutucuguna veri girilemedigini dogrular
    And Staff , Diagnosis kutucuguna veri girilemedigini dogrular
    And Sayfayi Kapat..

  Scenario: TC04 Staff Hasta için gerekli doktoru seçebilmeli ve randevuyu oluşturmalı.

    Given Staff , My Pages basligindaki Search Patient butonunu tiklar
    When Staff , SSN kutucuguna veri girerek hasta aratir
    Then Staff , View,Edit ve Show Appointment butonlarini goruntuler
    And Staff , Show Appointment butonunu tiklar
    And Staff , Edit butonunu tiklar
    And Staff , Physician kutucugundan doctor secer
    And Staff , Appointmen Save butonuna tiklar
    And Staff , Appointment is Updated alertunun gorundugunu dogrular
    And Sayfayi Kapat..


