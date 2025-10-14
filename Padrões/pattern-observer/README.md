💡 Padrão Observer - Sistema de Blog
✅ O que é
O Observer permite que múltiplos objetos (observadores) sejam notificados automaticamente quando outro objeto (sujeito) muda seu estado.
✅ Problema resolvido

Desacopla o sujeito dos observadores
Fácil adicionar/remover observadores dinâmicamente
Mais flexível e reutilizável
Implementação de um-para-muitos eficiente
Reduz acoplamento entre componentes

💡 Exemplo
Um blog que mantém uma lista de seguidores e os notifica automaticamente quando um novo artigo é publicado.
📂 Estrutura UML
                ┌──────────────────┐
                │  <<interface>>   │
                │    Sujeito       │
                │──────────────────│
                │+ inscrever()     │
                │+ desinscrever()  │
                │+ notificar()     │
                └────────┬─────────┘
                         △
                         │ implements
                         │
                    ┌────────┐
                    │  Blog  │
                    └────────┘

        ┌──────────────────┐
        │ <<interface>>    │
        │   Observador     │
        │──────────────────│
        │+ atualizar()     │
        └────────┬─────────┘
                 △
                 │ implements
                 │
            ┌─────────┐
            │Seguidor │
            └─────────┘
📋 Estrutura do Projeto

Sujeito.java - Interface para o publicador
Observador.java - Interface para os observadores
Blog.java - Classe concreta que implementa Sujeito
Seguidor.java - Classe concreta que implementa Observador
Main.java - Demonstra o padrão em uso
README.md - Esta documentação