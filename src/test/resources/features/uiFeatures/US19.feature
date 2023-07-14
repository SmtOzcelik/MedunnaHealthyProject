

@All_US_019
Feature: Admin olarak; Yeni Staff (Personel) Oluşturma / Güncelleme / Görüntüleme ve Silme
  @US_019_TC01
  Scenario: Admin SSN kullanarak; kayıtlı kişiler arasında Staff arayabilir.

    Given Kullanici Medunna sayfasina gider
    Then  Sign in Butonuna Tıklar
    And   Username bolumune tıklar ve kullanici adi girer
    And   Password bolumune tiklar ve sifre girer
    And   Sign In butonuna tiklar ve login olur
    And   Items&Titels sekmesinden Staff bolumune girer
    And   Staff bolmune girildigi test edilir
    And   Create a new Staff butonu tiklanir
    And   Use search kutucugu tiklanarak secili hale getirilir
    And   SSN alanina gecerli bir SSN no girilir
    And   Search User butonu tiklanarak girilen SSN bilgilerine ait Staff bilgilerinin geldigi gorulur

  @US_019_TC02
  Scenario: Yeni Staff eklemek icin Tüm bilgiler doldurulmalıdır
    Given Kullanici admin olarak giris yapar
    Then  Items&Titels sekmesinden Staff bolumune girer
    And   Staff bolmune girildigi test edilir
    And   Create a new Staff butonu tiklanir
    And   First Name bilgisi doldurulur
    And   Last Name bilgisi doldurulur
    And   Birth Date bilgisi doldurulur
    And    Phone sekmesine 10 haneli tel no girilir
    And   Gender secilir
    And   -Blood Group tıklanarak kan grubu secilir
    And   -Adress bilgisi doldurulur
    And   -Description bilgisi doldurulur
    And   -Country bilgisi secilir
    And   -State-City  sekmesi tiklanarak  secim yapilir
    And   -Save tusu tıklanarak kayıt edilir
    And   -SSN bilgisi ile sorgulama yapilarak kayit isleminin basarili oldugu test edilir

  @US_019_TC03
  Scenario: Admin kayıtlı kişilerden bir kullanıcı seçebilir.
    Given   Kullanici admin olarak giris yapar
    Then    Items&Titels sekmesinden Staff bolumune girer
    And     Staff bolmune girildigi test edilir
    And     Gelen listedeki Staff'lerin ID stununda gorulen ID lerine tiklayarak secim yapar
    And     Secilen ID bilgilerine sahip Staff bilgilerinin goruldugu test edilir

  @US_019_TC04
  Scenario: Admin kullanıcı bilgilerini düzenleyebilir.
    Given  Kullanici admin olarak giris yapar
    Then   Items&Titels sekmesinden Staff bolumune girer
    And    Staff bolmune girildigi test edilir
    And    Kullanici bilgilerinin yer aldigi satirda edit bolümü tiklanir
    And    Acilan ekranda degistirilmek istenen bilgi guncellemesi yapilir
    And    Save butonu tiklanarak duzenlemenin kaydedildigi test edilir.

  @US_019_TC05
  Scenario: Admin, personeli silebilmeli.
    Given  Kullanici admin olarak giris yapar
    Then   Items&Titels sekmesinden Staff bolumune girer
    And    Staff bolmune girildigi test edilir
    And    Silinmesi istenen Staff satirindaki Delete butonuna tiklanir
    And    Acilan onay ekraninda Delete butonuna tiklanir
    And    SSN bilgisi ile sorgulama yapilarak ilgili kaydin gorulmedigi test edilir
    


  Scenario: TC003

    And Gelen listedeki Staff'lerin ID stununda gorulen ID'lerine tiklayarak secim yapar
    And Secilen ID bilgilerine sahip Staff bilgilerinin goruldugu test edilir


    Scenario: TC004

    And Kullanici bilgilerinin yer aldigi satirda edit bolümü tiklanir
    And Acilan ekranda degistirilmek istenen bilgi guncellemesi yapilir
    And Save butonu tiklanarak düzenlemenin kaydedildigi test edilir.

      Scenario: TC005

      And Silinmesi istenen Staff satirindaki Delete butonuna tiklanir
      And Acilan onay ekraninda Delete butonuna tiklanir
      And SSN bilgisi ile sorgulama yapilarak ilgili kaydin gorulmedigi test edilir











