@US09
Feature:US09 Staff (Personel),hasta bilgilerini görebilmeli, düzenleyebilmeli ama silememelidir.


  Scenario: TC001 "My Pages" sekmesinden hasta bilgilerini görebilmelidir.
    Given logIn
    When My Pages sekmesine tiklar
    Then Search Patient secegine tiklar
    And Hasta bilgilerini gorur
    And hasta sayfayi kapatir

  Scenario:TC002 Kullanıcı bütün hasta bilgilerini "id, firstname, lastname, birthdate, email, phone, gender, blood group,
  address, description, user, country and state/city" düzenleyebilmelidir."

    Given logIn
    When My Pages sekmesine tiklar
    Then Search Patient secegine tiklar
   Then Kullanici Edit butonuna tiklar.
    And Id bilgisi duzenlenmedi
    And Hastanin diger bilgileri guncellendi
    And hasta sayfayi kapatir

  Scenario: TC003 Kullanıcı, SSN'lerine göre yeni bir başvuru sahibi arayabilmeli ve tüm kayıt bilgilerinin doldurulduğunu görebilmelidir.
    Given logIn
    When My Pages sekmesine tiklar
    Then Search Patient secegine tiklar
    Then Hasta arama kutusuna hastanin "122-56-9045"'i girilir
    And Wiev'e tiklanir
    And Tum bilgilerin dolduruldugu goruldu
    And hasta sayfayi kapatir

  Scenario: TC004 Kullanıcı herhangi bir hasta bilgisini silebilir.
    Given logIn
    When My Pages sekmesine tiklar
    Then Search Patient secegine tiklar
    And Hasta arama kutusuna hastanin "122-56-9045"'i girilir
    And Edit butonuna tiklanir
    And Herhangi bir hasta bilgisi silindi
    And hasta sayfayi kapatir


