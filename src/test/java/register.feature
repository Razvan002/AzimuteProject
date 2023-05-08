Feature: Testare a butonului de inregistrare

  Background:
    Given Deschidem pagina de web San Marco pentru register

  Scenario: Register de pe pagina principala
    Then Click the Register button
    And Introducem "name": "nume2"
    And Introducem "prenume": "prenume2"
    And Introducem "email": "claudiugradea@yahoo.com"
    And Introducem numarul de "telefon": "0736019777"
    And Introducem "password": "123456"
    Then Acceptam Politica de confidentialitate pentru cont nou
    And Apasam pe butonul Inregistrare

  Scenario: "Ai deja cont? Log in aici"
    Then Click the Register button
    And Click pe butonul ai deja cont