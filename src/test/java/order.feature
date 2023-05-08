Feature: Testarea comenzilor si plasarea acestora

  Scenario: Comanda de savarina
      Given Deschidem pagina de web San Marco
      Then Click pe butonul "deserturi"
      And Click pe butonul de adaugat in cos
      And Click pe cos de produse
      And Completam detaliile necesare

  Scenario: Datele necesare
      Given Deschidem pagina de web San Marco pentru comanda
      And Click pe date livrare
      And Completam "nume": "Gradea"
      And Completam "prenume": "Razvan"
      And Completam "email": "gradea.razvan03@gmail.com"
      And Completam "telefon": "0755803088"
      And Introducem strada
      And Completam "nrstrada": "15"
      And Completam "repere": "Masina verde in fata casei"
      And Alegem metoda de plata

