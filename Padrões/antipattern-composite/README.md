❌ Antipattern Composite - Sistema de Biblioteca
✅ O que é
Quando não existe uma interface comum entre objetos compostos (Prateleira) e individuais (Livro), forçando o cliente a tratá-los de forma diferente.


❌ Problema

Cliente precisa saber se está lidando com um Livro ou uma Prateleira.
Não há maneira uniforme de exibir ambos.
Código duplicado: precisa chamar exibir() separadamente para cada tipo.
Difícil adicionar novos comportamentos sem modificar o cliente.
Impossível trabalhar com uma coleção heterogênea de Livros e Prateleiras.

📂 Estrutura UML
┌─────────────┐           ┌────────────────┐
│    Livro    │           │   Prateleira   │
├─────────────┤           ├────────────────┤
│ - titulo    │           │ - categoria    │
│ - autor     │           │ - livros: List │
├─────────────┤           ├────────────────┤
│ + exibir()  │           │ + exibir()     │
└─────────────┘           │ + adicionar()  │
                          └────────────────┘

     (Sem interface comum)





📋 Estrutura do Projeto


Livro.java - Representa um item individual
Prateleira.java - Representa um grupo de livros
Main.java - Demonstra o antipadrão em uso
README.md - Esta documentação