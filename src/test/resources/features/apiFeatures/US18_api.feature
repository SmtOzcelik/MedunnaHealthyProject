@US018_TC_10
Feature: US18_Api_Test

Scenario: TC10 Admin API kullanarak physicians bilgilerini dogrulamalidir

  Given Admin Medunna Url i id ile ayarlar.
  When Admin GET request gonderir.
  Then Admin json datayi deserialize yaparak javaya dondurur.
  And Admin status kodunun ikiyuz oldugu gorulur.
  And Admin tum physicians bilgilerini API response ile alir.
  And Admin response'u API ile dogrular.