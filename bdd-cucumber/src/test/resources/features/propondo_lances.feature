Feature: Propondo lances ao leilao

Pode escrever um texto aqui que serve de documentacao, mas sera ignorado pelo Cucumber

Scenario: Propondo um unico lance valido
 Given Dado um lance valido
 When Quando propoe ao leilao
 Then Entao o lance eh aceito