
  Feature: US20 Admin User management menusunden kullanıcı Active eder ve gerekli rolleri olusturur

    Scenario: TC001 Admin User management menusundeki bilgileri görebilmeli

      Given Admin Url adresine gider
      Then  Admin kullanici girisine tiklar
      And   Admin Login islemini gerceklestirir
      And   Administrationa tiklar
      And   User managementa tiklar
      And   Register yaptigi kullaniciyi gorur
      And   Kullanicinin uzerinde edit yapar
      And   Kullanicinin ID Login first name last name email Language Profiles bilgilerini gordugunu dogrular

    Scenario: TC002 Admin User management menusunde kullanici active edebilmeli


      Given Admin Url adresine gider
      Then  Admin kullanici girisine tiklar
      And   Admin Login islemini gerceklestirir
      And   Admin kullaniciyi active eder
      And   Admin kullaniciyi active ettigini dogrular

    Scenario: TC003 Admin User management menusunde active ettigi kullanicinin rolunu olusturabilmeli

      Given Admin Url adresine gider
      Then  Admin kullanici girisine tiklar
      And   Admin Login islemini gerceklestirir
      And   Admin kullanicinin Profiles butonuna tiklar
      And   Admin kullaniciyi active ettigini dogrular












