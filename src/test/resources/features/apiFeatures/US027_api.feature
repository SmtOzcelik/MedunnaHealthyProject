Feature:

  Scenario Outline: Kullanıcı, API kullanarak ileti oluşturmayı ve okumayı doğrulamalıdır

    Given kullanici path params olusturur.
    And kullanici expected data olusturur, "<email>" "<message>" "<name>" "<subject>"
    And kullanici post request gonderir
    And kullanici gelen response'u dogrular.


    Examples:
      | email       | message | name  | subject |
      | abc@xzy.com | merhaba | kemal | selam   |






