Feature:
@US17*
Scenario: Kullanici, API kullanarak item olusturur ve dogrular

  Given Kullanici pathparams olusturur
  And   Kullanici expected data olusturur
  And   Kullanici post request gonderir
  And   Kullanici gelen responsu dogrular


  Scenario: Kullanici, API kullanarak item olusturur ve dogrular

    Given Kullanici pathparams olusturur
    And   Kullanici expected data olusturur
    And   Kullanici put request gonderir
    And   Kullanici gelen responsu dogrular


  Scenario: Kullanici, API kullanarak item siler ve dogrular

    Given Kullanici path params olusturur
    And Kullanici delete request gonderir
    And Kullanici status code 200 oldugunu dogrular





