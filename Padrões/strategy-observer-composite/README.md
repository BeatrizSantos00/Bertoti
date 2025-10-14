🔗 Strategy + Observer + Composite
✅ O que é
Exemplo que junta os três padrões em um único cenário: uma empresa com departamentos, funcionários e tarefas.
💡 Exemplo

Funcionários (Composite + Sujeito) podem ser agrupados em Departamentos.
Cada funcionário tem uma tarefa configurável (Strategy) que pode ser trocada em tempo de execução.
Todos os funcionários e departamentos podem ser notificados quando mudanças ocorrem (Observer).

📂 Estrutura UML Combinada
                    ┌──────────────┐
                    │   Tarefa     │ (Strategy)
                    │ (interface)  │
                    └──────────────┘
                           ▲
                ┌──────────┴──────────┐
                │                     │
          ┌──────────────┐    ┌──────────────┐
          │Programação   │    │  Design      │
          └──────────────┘    └──────────────┘

        ┌──────────────────┐    ┌──────────────────┐
        │  Sujeito         │    │  Observador      │
        │  (interface)     │    │  (interface)     │
        └──────┬───────────┘    └─────────┬────────┘
               │                          │
        ┌──────┴───────────┐        ┌─────┴────────┐
        │ Funcionario      │        │ Funcionario  │
        │ (Sujeito+        │        │ (Observador) │
        │  Observador)     │        │              │
        └──────┬───────────┘        └──────────────┘
               │                           ▲
               │                           │
               └───────────────┬───────────┘
                         ┌─────┴──────┐
                         │Departamento│
                         │(Composite+ │
                         │ Observador)│
                         └────────────┘
📋 Estrutura do Projeto

Tarefa.java - Interface para Strategy
TarefaProgramacao.java - Implementação concreta
TarefaDesign.java - Implementação concreta
Observador.java - Interface para Observer
Sujeito.java - Interface para Observer (Subject)
Funcionario.java - Usa Strategy, implementa Observer e Sujeito
Departamento.java - Composite que implementa Observer
Main.java - Demonstra os 3 padrões funcionando juntos
README.md - Esta documentação

