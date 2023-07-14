Feature: US026 Medunna Contact messages

  Background: Herhangi bir kullanici, bilgi almak icin "Contact portal" uzerinden istek gonderebilmeli.
    Given Kullanici url'e gider
    Then kullanici contact butonuna tiklar



    Scenario: TC01 Herhangi bir kullanici, bilgi almak icin "Contact portal" uzerinden istek gonderebilmeli.
      Then kullanici 'Contact' sayfasinin goruntulendigini dogrular.
      And kullanici sayfayi kapatir.


     Scenario Outline: TC02 Kullanici "Name, Email, Subject, Message" bolumlerine data girebilmeli ve mesajini gonderebilmeli.
        Then kullanici name textboxa "<isim>" girer
        Then Kullanici email textboxa "<email>" girer
        Then kullanici subject textboxa "<konu basligi>" girer
        Then kulanici message textboxa "<mesaj>" girer
        Then kullanici Send butonuna tiklar.
        And  kullanici mesajin kaydedildigini dogrular
        And  kullanici sayfayi kapatir.

       Examples:
         | isim | email        | konu basligi | mesaj      |
         | Ali  | ali@veli.com | randevu      | 10.05.2023 rarihli randevumu iptal etmek istiyorum|









