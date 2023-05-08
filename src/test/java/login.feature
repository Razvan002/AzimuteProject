Feature: Testing the login button

  Background:
    Given Deschidem pagina de web San Marco pentru login

  Scenario: Login de pe pagina principala
    Then Click the Login button
    And Introducem email: "gradea.razvan03@gmail.com"
    And Introducem parola: "123456"
    Then Acceptam Politica de confidentialitate
    And Apasam pe butonul Log In

  Scenario: "Ai uitat parola? Click aici"
    Then Click the Login button
    And Click pe butonul de recuperare
    And Introducem email-ul "gradea.razvan03@gmail.com" pentru recuperare
    Then Click pe trimite parola