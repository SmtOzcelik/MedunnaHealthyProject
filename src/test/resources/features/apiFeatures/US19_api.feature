@US19
Feature: Api_US019 - Create, edit or delete Staff by just Admin and Validate with API

  Scenario: TC01 - Validate  staff info with API

    Given gereken endpoint ayarlanir
    When get sorgusu gonderilir
    Then status kodunun "200" oldugu dogrulanir
    And response bodysinin beklenen sekilde geldigi dogrulanir