Feature: Testare a butonului de inregistrare

  Background:
    Given Deschidem pagina de web San Marco pentru register

  Scenario: Register de pe pagina principala
    Then Click the Register button
    And Introducem "name": "Gradea"
    And Introducem "prenume": "Razvan"
    And Introducem "email": "unemail@yahoo.com"
    And Introducem numarul de "telefon": "0755803088"
    And Introducem "password": "123456"
    Then Acceptam Politica de confidentialitate pentru cont nou
    And Apasam pe butonul Inregistrare

  Scenario: Ai deja cont? Log in aici
    Then Click the Register button
    And Click pe butonul ai deja cont