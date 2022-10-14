Feature: US004 Parametre Kullanimi
  Scenario: TC01 Parametre Kullanimi
    Given kullanici "https://www.hepsiburada.com" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'nin "facebook" icerdigini test edelim
    And sayfayi kapatir
