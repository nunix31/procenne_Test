Feature: US006 Kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir

    Given kullanici amazon sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder


    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella | nutella |
      | selenium | selenium |
      | çikolata | çikolata |


