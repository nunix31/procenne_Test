Feature: US002 Parametre Kullanimi
  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    Given kullanici amazon sayfasina gider
    Then kullanici "java" icin arama yapar
    And sonuclarin "java" icerdigini test eder
    And sayfayi kapatir