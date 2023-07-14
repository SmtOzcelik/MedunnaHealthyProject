Feature: US18 Admin olarak; Yeni Physicians Oluştur / Güncelle / Görüntüle ve Sil

  Background: Login islemi
  Given Admin, Url adresine gider
  When Admin, Sign in butonuna tiklar..
  Then Admin, Sign in islemini gerceklestirir.


  Scenario: TC01 Admin,  doktorların bilgilerini gorebilmelidir.

    Given Admin, Doctors sekmesini tiklar
    When Admin, My Links basligi altindaki Physician linkini tiklar
    Then Admin, Doctor listesini goruntuler
    And Sayfayi Kapat..

  Scenario: TC02 Admin, SSN kimligine gore kayitli bir kişiyi secebilir/arayabilir.

    Given Admin, Doctors sekmesini tiklar
    When Admin, My Links basligi altindaki Physician linkini tiklar
    Then Admin, Create a new Physician butonunu tiklar
    And Admin, Use Search kutucugunu isaretler
    And Admin, SSN kutucuguna gecerli bir SSN verisi girer
    And Admin, Search User butonunu tiklar
    And Admin, girdigi SSN'e ait kaydi goruntuler
    And Sayfayi Kapat..

  Scenario: TC03 Admin, Doktorlarin bilgilerini Edit Butonu uzerinden duzenleyebilir.

  Given Admin, Doctors sekmesini tiklar
  When Admin, My Links basligi altindaki Physician linkini tiklar
  Then Admin, Doctor listesini goruntuler
  And Admin, Edit butonunu tiklar
  And Admin, Doctor bilgilerinin yer aldigi ekrani goruntuler
  And Sayfayi Kapat..


  Scenario: TC04 Kisilerin "firstname, lastname birth date .." bilgileri doldurulabilmeli.

    Given Admin, Doctors sekmesini tiklar
    When Admin, My Links basligi altindaki Physician linkini tiklar
    Then Admin, Doctor listesini goruntuler
    And Admin, Edit butonunu tiklar
    And Admin, First Name kutucuguna yeni veri girer
    And Admin, LastName kutucuguna yeni veri girer
    And Admin, Birdt Day kutucuguna yeni veri girer
    And Sayfayi Kapat..

  Scenario: TC05 Admin Doktor icin bir uzmanlik alani secebilmeli.

    Given Admin, Doctors sekmesini tiklar
    When Admin, My Links basligi altindaki Physician linkini tiklar
    Then Admin, Doctor listesini goruntuler
    And Admin, Edit butonunu tiklar
    And Admin, Speciality kutucugunda ddm'den secim yapar
    And Sayfayi Kapat..


  Scenario: TC06 Admin, doktorun profil resmini sağlayabilir.

    Given Admin, Doctors sekmesini tiklar
    When Admin, My Links basligi altindaki Physician linkini tiklar
    Then Admin, Doctor listesini goruntuler
    And Admin, Edit butonunu tiklar
    And Admin, Choose File butonunu tiklar
    And Sayfayi Kapat..

  Scenario: TC07 Admin, doktorun Muayene ucretini girebilmelidir. (Exam fee)

    Given Admin, Doctors sekmesini tiklar
    When Admin, My Links basligi altindaki Physician linkini tiklar
    Then Admin, Doctor listesini goruntuler
    And Admin, Edit butonunu tiklar
    And Admin, Exam Fee kutucuguna veri girer
    And Sayfayi Kapat..

  Scenario: TC08 Admin, mevcut kullanicilar arasindan secim yapabilmelidir.

    Given Admin, Doctors sekmesini tiklar
    When Admin, My Links basligi altindaki Physician linkini tiklar
    Then Admin, Doctor listesini goruntuler
    And Admin, Edit butonunu tiklar
    And Admin, User kutucugundaki ddm'den secim yapar
    And Sayfayi Kapat..

  Scenario: TC09 Admin mevcut doktorları silebilir.

    Given Admin, Doctors sekmesini tiklar
    When Admin, My Links basligi altindaki Physician linkini tiklar
    Then Admin, Doctor listesini goruntuler
    And Admin, Delete butonunu tiklar
    And Admin, Confirm Delete alert'unu gorur
    And Admin, Alert uzerindeki Delete butonunu tiklar
    And Sayfayi Kapat..







