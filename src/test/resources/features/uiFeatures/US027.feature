Feature: US027 Country creation / update / read and Delete by Admin

  Background: : Admin giris yapar
    Given Kullanici url'e gider
    Then kullanici insan ikonuna tıklar
    And kullanici  gecerli username ve gecerli password girer
    And Sign in butonuna tiklar

  Scenario:TC01 Admin, mesaj portalına gidebilir ve tüm mesajları, yazarlarını ve e-postalarını görüntüleyebilir.
   Given kullanici admin sayfasının goruntulendigini dogrular
    Then kullanici items and titles dropdown menu butonuna  tıklar
    Then kullanici message butonuna tıklar
    And  kullanici message sayfasının görüntülendigini dogrular
    And    kullanici sayfayi kapatir.


  Scenario: TC02 Admin mesajlari olusturabiir
    Given kullanici admin sayfasının goruntulendigini dogrular
    Then  kullanici items and titles dropdown menu butonuna  tıklar
    Then  kullanici message butonuna tıklar
    Then  kullanici create a new message butonuna tıklar
    Then  kullanici create a new message name textboxa random bir isim gonderir
    Then  kullanici create a new message email textboxa random bir mail gonderir
    Then  kullanici create a new message subject textboxa random bir subject gonderir
    Then  kullanici create a new message message textboxa random bir message gonderir
    And   kullanici create a new message save botonuna tıklar
    And   kullanici  A new Message is created with identifier  mesajinin alindigini dogrular
    And    kullanici sayfayi kapatir.


  Scenario: TC03 Admin, mesajları  güncelleyebilir,
    Given kullanici admin sayfasının goruntulendigini dogrular
    Then  kullanici items and titles dropdown menu butonuna  tıklar
    Then  kullanici message butonuna tıklar
    Then  kullanici listeden editlemek istedigi herhangibir mesajin Edit butonuna tiklar
    Then  kullanici create a new message name textboxa random bir isim gonderir
    Then  kullanici create a new message email textboxa random bir mail gonderir
    Then  kullanici create a new message subject textboxa random bir subject gonderir
    Then  kullanici create a new message message textboxa random bir message gonderir
    And   kullanici create a new message save botonuna tıklar
    And   kullanici a message is updated mesajinin gorundugunu dogrular
    And kullanici sayfayi kapatir.



  Scenario: TC04 Admin nessageleri silebilir
     Given kullanici admin sayfasının goruntulendigini dogrular
    Then  kullanici items and titles dropdown menu butonuna  tıklar
    Then  kullanici message butonuna tıklar
    Then  kullanici listeden silmek istedigi herhangibir mesajin Delete butonuna tiklar
    Then kullanici mesaj silme islemini onaylar
    Then kullanici A Message is deleted with identifier mesajinin gorundugunu dogrular
    And kullanici sayfayi kapatir.











