@US11
Feature: US_11 My Appointments Physician (Doctor) tarafindan duzenlenebilmeli

  Scenario: TC001 My Appointments Physician (Doctor) tarafindan duzenlenebilmeli

    Given Dr. Url adresine gider
    Then Dr.Kullanici bilgi sekmesini tiklar
    And Dr.Login islemini gerceklestirir
    And Dr.MY PAGES sekmesini tiklar
    And Dr.My Appointments sekmesine tiklar
    And Dr.Hasta randevu listesini goruntuler
    And Dr.Edit butonuna tiklar
    And Dr.Create or edit an apppointment menusune ulasir
    And Dr.sayfayi kapatir

  Scenario: TC002 Bir randevu guncellendiğinde; kullanici (doktor), hastanin aşağidaki bilgilerini gormelidir.id, start and end date, Status, physician and patient


    Given Dr. Url adresine gider
    Then Dr.Kullanici bilgi sekmesini tiklar
    Then Dr.Login islemini gerceklestirir
    Then Dr.MY PAGES sekmesini tiklar
    Then Dr.My Appointments sekmesine tiklar
    And Dr.Hasta randevu listesini goruntuler
    And Dr. Hastanin id bilgisini gorunurlugunu dogrular
    And Dr. Hastanin Start Date Time bilgisini gorunurlugunu dogrular
    And Dr. Hastanin End DateTime bilgisini gorunurlugunu dogrular
    And Dr. Hastanin Status bilgisini gorunurlugunu dogrular
    And Dr. Hastanin Physician bilgisini gorunurlugunu dogrular
    And Dr. Hastanin Patient bilgisini gorunurlugunu dogrular
    And Dr. Hastanin Status bilgisini gorunurlugunu dogrular
    And Dr.sayfayi kapatir

  @US11TC03
  Scenario: TC003 Doktor Anamnesis, Treatment ve Diagnosis alanlarini doldurmak zorundadir.
    Given Dr. Url adresine gider
    Then Dr.Kullanici bilgi sekmesini tiklar
    Then Dr.Login islemini gerceklestirir
    Then Dr.MY PAGES sekmesini tiklar
    Then Dr.My Appointments sekmesine tiklar
    And Dr.Hasta randevu listesini goruntuler
    And Dr. Edit butonuna tiklar
    And Dr. Anamnesis bolumu bos birakilamaz
    And Dr. Treatment bolumu bos birakilamaz
    And Dr. Diagnosis bolumu bos birakilamaz
    And Dr.sayfayi kapatir

  Scenario: TC004 Doktor Anamnesis, Treatment ve Diagnosis alanlarini doldurmak zorundadir.
    Given Dr. Url adresine gider
    Then Dr.Kullanici bilgi sekmesini tiklar
    Then Dr.Login islemini gerceklestirir
    Then Dr.MY PAGES sekmesini tiklar
    Then Dr.My Appointments sekmesine tiklar
    And Dr.Hasta randevu listesini goruntuler
    And Dr. Edit butonuna tiklar
    And Dr. Anamnesis bolumune tiklar ve bilgileri girer.
    And Dr. Treatment bolumune tiklar ve bilgileri girer.
    And Dr. Diagnosis bolumune tiklar ve bilgileri girer.
    And Dr.sayfayi kapatir

  Scenario: TC005 prescription ve description istege bagli olmalidir.
    Given Dr. Url adresine gider
    Then Dr.Kullanici bilgi sekmesini tiklar
    Then Dr.Login islemini gerceklestirir
    Then Dr.MY PAGES sekmesini tiklar
    Then Dr.My Appointments sekmesine tiklar
    And Dr.Hasta randevu listesini goruntuler
    And Dr. Edit butonuna tiklar
    And Dr. prescription bolumune istege bagli bilgi girer.
    And Dr. description bolumune istege bagli bilgi girer.
    And Dr.sayfayi kapatir

  Scenario: TC006 "Status" doktor tarafindan "PENDING, COMPLETED veya CANCELLED" olarak seçilebilmelidir.

    Given Dr. Url adresine gider
    Then Dr.Kullanici bilgi sekmesini tiklar
    Then Dr.Login islemini gerceklestirir
    Then Dr.MY PAGES sekmesini tiklar
    Then Dr.My Appointments sekmesine tiklar
    And Dr.Hasta randevu listesini goruntuler
    And Dr. Edit butonuna tiklar
    And Dr. Status e tiklar
    And Dr. acilan menude PENDING in secilebilir oldugunu dogrular.
    And Dr. acilan menude COMPLETED in secilebilir oldugunu dogrular.
    And Dr. acilan menude CANCELLED in secilebilir oldugunu dogrular.
    And Dr. acilan menude UNAPPROVED in secilemedigini dogrular.