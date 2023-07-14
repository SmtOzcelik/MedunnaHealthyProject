
Feature: US007 Kullanici API ile randevulari goruntuleyebilmeli

  Scenario: US007  SwaggerDoc kullanarak appointments alin ve dogrulayin

    Given DKullanici appointments icin endpoint belirler
    And   DKullanici send request ve get response yapar
    Then  DKullanici Api ile beklenen datalari dogrular