❌ Antipattern Observer - Sistema de Promoções
✅ O que é
Quando não existe desacoplamento entre quem envia a informação (sujeito/publicador) e quem recebe (observadores).
❌ Problema

Toda vez que o restaurante lança uma promoção, precisa chamar manualmente cada cliente.
Alto acoplamento: o Restaurante precisa conhecer todos os Clientes.
Se adicionar um novo cliente, precisa modificar o método lancarPromo().
Cada novo cliente exige alterar o código do Restaurante.
Impossível ter número dinâmico de clientes.

💡 Exemplo do Antipadrão
java// ❌ Acoplamento forte
restaurante.lancarPromo("Promoção!", cliente1, cliente2, cliente3);

// Se adicionar um cliente, precisa mudar isso:
restaurante.lancarPromo("Promoção!", cliente1, cliente2, cliente3, cliente4);
Um restaurante que chama diretamente o método de cada cliente para avisar sobre promoções.
📂 Estrutura UML (Antipadrão)
┌─────────────────────┐         ┌─────────────┐
│   Restaurante       │         │   Cliente   │
├─────────────────────┤         ├─────────────┤
│ - nome: String      │────────→│ - nome      │
│ - promocao: String  │ conhece │             │
├─────────────────────┤         ├─────────────┤
│ + lancarPromo()     │──────→  │+ receberPromo│
└─────────────────────┘         └─────────────┘
   (Altamente acoplado!)
📋 Estrutura do Projeto

Cliente.java - Classe que recebe notificações
Restaurante.java - Classe que envia notificações (acoplada)
Main.java - Demonstra o antipadrão em uso
README.md - Esta documentação