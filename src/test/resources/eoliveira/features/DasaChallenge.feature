
@dasa
Feature: Dasa Challenge
   
  Scenario: Validate Company Page Navigation
    Given Eu navego até dasa home page
    And Em Dasa Home page eu navego até companies
    And Eu seleciono região São Paulo
    And Eu listo os laboratórios de São Paulo no Console
    And Eu seleciono delboniauremo via url
    Then Eu verifico que estou na pagina delboniauremo via url
    