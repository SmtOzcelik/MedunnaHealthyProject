@US015
Feature: US_015 Admin tarafından hasta oluşturma ve duzenleme

  Background:
    Given  rg "medunnaUrl"'e gider

  @US015_TC01
  Scenario: TC_01 Yeni hastalar yalnızca yönetici tarafından oluşturulabilir
    When rg signin iconuna tiklar
    And rg signin butonuna tiklar
    And rg gecerli "adminUsername" kullanici adi girer
    And rg gecerli "adminPassword" kullanici sifresi girer
    And rg sign in butonuna tiklar
    And rg Item&Titles butonuna tiklar
    And rg Patient butonuna tiklar
    And rg Create a New Patient butonuna tiklar.
    Then rg Hasta olusturma sayfasina geldigi dogrulanir

  @US015_TC02
  Scenario: TC_02 Yeni hastalar yalnızca yonetici tarafından olusturulabilir(Negatif Test)
    When rg signin iconuna tiklar
    And rg signin butonuna tiklar
    And rg gecerli "staffUsername" kullanici adi girer
    And rg gecerli "staffPassword" kullanici sifresi girer
    And rg sign in butonuna tiklar
    And rg staff My Pages butonuna tiklar
    And rg staff Search Patient butonuna tiklar
    Then rg Create a New Patient butonunun olmadıgını dogrular.

  @US015_TC03
  Scenario: TC_03 Yeni hastalar yalnızca yonetici tarafından olusturulabilir(Negatif Test)
    When rg signin iconuna tiklar
    And rg signin butonuna tiklar
    And rg gecerli "physcianUsername" kullanici adi girer
    And rg gecerli "physcianPassword" kullanici sifresi girer
    And rg sign in butonuna tiklar
    And rg MYPAGES butonuna tiklar
    And rg My Patient butonuna tiklar
    Then rg Create a New Patient butonunun olmadıgını dogrular.

  @US015_TC04
  Scenario: TC_04 Yeni hastalar yalnızca yonetici tarafından olusturulabilir(Negatif Test)
    When rg signin iconuna tiklar
    And rg signin butonuna tiklar
    And rg gecerli "patientUsername" kullanici adi girer
    And rg gecerli "patientPassword" kullanici sifresi girer
    And rg sign in butonuna tiklar
    And rg My Pages(Patient) butonuna tiklar
    And rg Make an Appointment butonuna tiklar
    Then rg Create a New Patient butonunun olmadıgını dogrular.

  @US015_TC05
  Scenario: TC_05 Yonetici "SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address,
  Description, Created Date, User, Country and state / City" gibi hasta bilgilerini gorebilir.
    When rg signin iconuna tiklar
    And rg signin butonuna tiklar
    And rg gecerli "adminUsername" kullanici adi girer
    And rg gecerli "adminPassword" kullanici sifresi girer
    And rg sign in butonuna tiklar
    And rg Item&Titles butonuna tiklar
    And rg Patient butonuna tiklar
    Then rg SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and state City gibi hasta bilgilerini gorebilir.

  @US015_TC06
  Scenario: TC_09 Yonetici herhangi bir hastayı silebilir
    When rg signin iconuna tiklar
    And rg signin butonuna tiklar
    And rg gecerli "adminUsername" kullanici adi girer
    And rg gecerli "adminPassword" kullanici sifresi girer
    And rg sign in butonuna tiklar
    And rg Item&Titles butonuna tiklar
    And rg Patient butonuna tiklar
    And rg delete butonuna tiklar
