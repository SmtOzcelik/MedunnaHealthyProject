@US008
Feature: US008 Kullanici giris yaptiginda Password sekmesi duzenlenebilir olmalidir

  @US008_TC001
  Scenario:TC001 "New password confirmation" onaylanabilmelidir
    Given rg kullanici "medunnaUrl" url'e gider
    When rg kullanici login olur
    Then rg kullanici account menuden password link tiklar
    And rg kullanici current password girer
    And rg kullanici new password girer
    And rg kullanici new password confirmation girer
    And rg kullanici "The password and its confirmation do not match!" mesajinin gorunur olmadigini dogrular


  @US008_2345
  Scenario Outline:TC002 TC003 TC004 TC005 Sifre en az 1 buyuk harf icermeli ve "Password strength:" seviyesinin degistigi gorulebilmelidir.
    Given rg kullanici "medunnaUrl" url'e gider
    When rg kullanici login olur
    Then rg kullanici account menuden password link tiklar
    And rg kullanici current password girer
    And rg kullanici kucuk harf,buyuk harf,rakam ve ozel karakter sartlarindan herhangi ucu ile"<new password>" girer
    And rg kullanici Password strenght seviyesinin limegreen oldugunu dogrular
    And rg kullanici "<New password'a>" girmedigi sifre sartini ekler
    And rg kullanici Password strength seviyesinin green oldugunu dogrular

    Examples:
      | new password | New password'a |
      | AASS12312!   | aa             |
      | aa123231!!   | AA             |
      | AAAAasda!!   | 12             |
      | AAAAssds12   | !!             |


  @US008_TC006
  Scenario: TC006 Guclu bir parola icin sifre en az 7 karakterden olusmalidir
    Given rg kullanici "medunnaUrl" url'e gider
    When rg kullanici login olur
    Then rg kullanici account menuden password link tiklar
    And rg kullanici current password girer
    And rg kullanici kucuk harf,buyuk harf,rakam ve ozel karakter ile en az yedi karakterli new password girer
    And rg kullanici Password strength seviyesinin green oldugunu dogrular


  @US008_TC007
  Scenario: TC007 Eski sifre kullanilmamalidir
    Given rg kullanici "medunnaUrl" url'e gider
    When rg kullanici login olup account menuden password linke tiklar
    Then rg kullanici current passwordu girer ve new password ve confirm password'e eski sifreyi girer
    And rg kullanici save butonuna tiklar
    And rg kullanici 2 saniye bekler
    And rg kullanici Password changed! uyarisinin gorunur olmadigini dogrular


  @US008_negativeTC001
  Scenario: TC001 negatif "New password confirmation" onaylanabilmelidir
    Given rg kullanici "medunnaUrl" url'e gider
    When rg kullanici login olur
    Then rg kullanici account menuden password link tiklar
    And rg kullanici current password girer
    And rg kullanici new password box'a sifre girer
    And rg kullanici new password confirmation box'a new passworddan farkli sifre girer
    And rg kullanici "The password and its confirmation do not match!" mesajinin gorunur oldugunu dogrular
    And rg kullanici 2 saniye bekler


  @US008_negative1_TC006
  Scenario: TC006 negatif Guclu bir parola icin sifre en az 7 karakterden olusmalidir
    Given rg kullanici "medunnaUrl" url'e gider
    When rg kullanici login olur
    Then rg kullanici account menuden password link tiklar
    And rg kullanici current password girer
    And rg kullanici kucuk harf,buyuk harf,rakam ve ozel karakter ile en fazla alti karakterli new password girer
    And rg kullanici Password strength seviyesinin red oldugunu dogrular


  @US008_negative2_TC006
  Scenario Outline: TC006 negatif Guclu bir parola icin sifre en az 7 karakterden olusmalidir
    Given rg kullanici "medunnaUrl" url'e gider
    When rg kullanici login olur
    Then rg kullanici account menuden password link tiklar
    And rg kullanici current password girer
    And  rg Kullanici "<new password>" boxa en az yedi karakter girerek strenght bar'in farkli durumlarini test eder.

    Examples:
      | new password          |
      | ÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜ. |
      | 12312332              |
      | ASDFSDFD              |
      | aafsnffg              |
      | ........              |
      | ###########           |
      | @@@@@@@               |
      | @@@@@@@@@@            |
      | ##########.           |
      | ÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜ  |
      | Asf!23                |
