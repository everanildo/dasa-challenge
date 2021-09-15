# Desafio Dasa - Grupo FCamara
Projeto desenvolvido utilizando Java, Selenium, Cucumber e Versionado com Git.

### Pre-requisitos para execução
Instalação do Maven. 

http://charlesmms.azurewebsites.net/2017/09/04/instalando-maven-no-windows-10/

Dependencias já adicionadas dentro do arquivo pom.xml.

### Requisitos para o desafio:
• Utilizar BDD para o desenvolvimento do cenário;
• Preferencialmente, automatizar com Ruby, Cucumber e Capybara;
• Fazer uso de Page Objects;
• A automação deve rodar no Firefox e no Chrome.

___
### Desafio Proposto:
Funcionalidade: Navegar para pagina de parceiro pelo via portal Dasa.
Steps para o teste automatizado:
1. Acesse o site institucional da Dasa(https://dasa.com.br/).
2. Na página da Dasa, clique no link Nossas Marcas.
3. Na página das marcas, procure pelos laboratórios de São Paulo e liste todos os laboratórios do estado, exibindo os resultados no console.
4. Após listar, selecione o laboratório DelboniAuriemo.
5. Na página informativa do Delboni, valide que acessou a área do laboratório e em seguida clique no link com o nome da marca.
6. Após a página carregar, faça uma validação que foi direcionado corretamente para o site do Delboni Auriemo(https://delboniauriemo.com.br/).

