Feature: US22 Staff, Hasta Test sonuclarini gorebilir.

  Background: Login islemi
    Given Staff, Url adresine gider
    When Staff, Sign in butonuna tiklar..
    Then Staff, Sign in islemini gerceklestirir.


  Scenario: TC01 Kullanıcı (Staff) hastanin SSN id ile arama yapabilir.

    Given Staff , My Pages basligindaki Search Patient butonunu tiklar
    When Staff , SSN kutucuguna veri girerek hasta aratir
    And Sayfayi Kapat..

  Scenario: TC02 Staff hastanin test sonuclarini gorebilmelidir.

    Given Staff , My Pages basligindaki Search Patient butonunu tiklar
    When Staff , SSN kutucuguna belli veri girerek hasta aratir
    And Staff , Show Appointment butonunu tiklar
    And Staff , Show Tests butonunu tiklar
    And Staff , View Results butonunu tiklar
    And Staff , Test Results ekraninin gorundugunu dogrular
    And Sayfayi Kapat..

  Scenario: TC03 Staff "ID, Date, Result, description, Created date, ..." gibi sonuc bilgilerini gorebilmeli ve guncelleyebilmelidir.

    Given Staff , My Pages basligindaki Search Patient butonunu tiklar
    When Staff , SSN kutucuguna belli veri girerek hasta aratir
    And Staff , Show Appointment butonunu tiklar
    And Staff , Show Tests butonunu tiklar
    And Staff , View Results butonunu tiklar
    And Staff , TestResults ekraninda Edit butonunu tiklar
    And Staff , EditTestResults ekraninda ID kutucugunun secilebilir oldugunu dogrular
    And Staff , EditTestResults ekraninda Date kutucugunun secilebilir oldugunu dogrular
    And Staff , EditTestResults ekraninda Result kutucugunun secilebilir oldugunu dogrular
    And Staff , EditTestResults ekraninda Result kutucuguna veri girer
    And Staff , EditTestResults ekraninda Description kutucugunun secilebilir oldugunu dogrular
    And Staff , EditTestResults ekraninda Description kutucuguna veri girer
    And Staff , EditTestResults ekraninda Created Date kutucugunun secilebilir oldugunu dogrular
    And Staff , EditTestResults ekraninda TestItem kutucugunun secilebilir oldugunu dogrular
    And Staff , EditTestResults ekraninda Test kutucugunun secilebilir oldugunu dogrular
    And Staff , EditTestResults ekraninda Save butonuna tiklar.
    And Staff , EditTestResults ekraninda TestResultUpdate alertunu dogrular
    And Sayfayi Kapat..
