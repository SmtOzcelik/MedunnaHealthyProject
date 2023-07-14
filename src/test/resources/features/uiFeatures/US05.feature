@medunnaUS5UI
Feature: US5 UI
  Scenario:  TC01 Kullanıcı First Name Bos Bırakamaz
    Given Kullanici "https://medunna.com/" adresine gider.
    Then  Kullanici Make an Appointment linkine tiklar
    And  Kullanici First Name bos birakarak
    And  "Send an Appointment Request" butonuna tiklar
    Then Kullanici Your FirstName is required. uyarisini dogrular




  Scenario: TC02 Kullanıcı Last Name Bos Bırakamaz
    Given  Kullanici "https://medunna.com/" adresine gider
    Then  Kullanici Make an Appointment linkine tiklar
    And  Kullanici Last Name bos birakarak
    And  "Send an Appointment Request" butonuna tiklar
    Then Kullanici Your Last Name is required. uyarisini dogrular



  Scenario:  TC03 Kullanıcı SSN Numarasi Bos Bırakamaz
    Given Kullanici "https://medunna.com/" adresine gider
    Then  Kullanici Make an Appointment linkine tiklar
    And  Kullanici SSN Numarasi bos birakarak
    And  "Send an Appointment Request" butonuna tiklar
    Then Kullanici Your SSN Numarasi is required. uyarisini dogrular

  Scenario:  TC04 Kullanıcı Phone Numarasi Bos Bırakamaz
    Given Kullanici "https://medunna.com/" adresine gider
    Then Kullanici Make an Appointment linkine tiklar
    And Kullanici Phone Numarasi bos birakarak
    And "Send an Appointment Request" butonuna tiklar
    Then Kullanici Your Phone Numarasi is required. uyarisini dogrular

  Scenario:  TC05 Kullanıcı Email Bos Bırakamaz
    Given  Kullanici "https://medunna.com/" adresine gider
    Then  Kullanici Make an Appointment linkine tiklar
    And  Kullanici Email bos birakarak
    And  "Send an Appointment Request" butonuna tiklar
    Then  Kullanici Your Email is required. uyarisini dogrular


  Scenario:  TC06 Kullanıcı tum bilgileri doldurur
    Given  Kullanici "https://medunna.com/" adresine gider
    Then  Kullanici Make an Appointment linkine tiklar
    And  Kullanici Gecerli bir First Name yazar
    And Kullanici Gecerli bir Last Name yazar
    And Kullanici Gecerli bir SSN yazar
    And Kullanici Gecerli bir Email yazar
    And Kullanici Gecerli bir Phone yazar
    And "Send an Appointment Request" butonuna tiklar
    Then Kullanici "Appointment registration saved! We will call you as soon as possible." yazisini dogrular

  Scenario:  TC07 Kullanıcı profillerini görebilir ve uygulamada oturum açabilir.
    Given  Kullanici "https://medunna.com/" adresine gider
    Then  Kullanici ok ikonuna  tiklar
    And  Kullanici Singin linkine tiklar
    And  Kullanici Gecerli bir User Name yazar
    And   Kullanici Gecerli bir Password Name yazar
    And  Kullanici Gecerli bir Singin butona tıklar
    Then  Kullanici profilini dogrular


