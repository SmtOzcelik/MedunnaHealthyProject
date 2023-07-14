
@US04
Feature: US004

  Background: Ortak Adimlar

    Given Kullanici url'e gider
    When  Profil resmine tıklar
    Then  Kullanici sing in'e tıklar

  Scenario: TC001

    And Kullanici adini girer
    And Kullanici dogru bir sifre girer
    And Kullanici sing in'e tıkla
    And Kullanici basarı mesajının gorunurlugunu dogrular


  Scenario: TC002

    And Kullanici gelen sayfada "Remember me" butonunu oldugunu doğrular

  Scenario: TC003

    And Kullanici gelen sayfada "Did you forget your password?" butonunu oldugunu doğrular

  Scenario: TC004

    And Kullanici gelen sayfada "You don't have an account yet? Register a new account" butonunu oldugunu doğrular

  Scenario: TC005

    And Kullanıcı randevu alıp kaydolduğunda, profillerini görebilir ve uygulamada oturum açabilir.


