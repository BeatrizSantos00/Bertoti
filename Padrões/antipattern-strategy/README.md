❌ Antipattern Strategy - Sistema de Veículos
✅ O que é
É quando a lógica de comportamento (ex.: tipo de motor de um veículo) fica fixa dentro da classe, sem flexibilidade para mudar ou reaproveitar.
❌ Problema

Código duplicado em vários if-else statements.
Dificuldade de manutenção: mudar o comportamento de um motor exige editar a classe.
Pouca reutilização de código.
Impossível mudar o tipo de motor em tempo de execução.
Violação do princípio Open/Closed: classe fica aberta para modificação.

💡 Exemplo do Antipadrão
java// ❌ Lógica fixa dentro da classe
Veiculo v1 = new Veiculo("Ferrari", "Gasolina");
v1.acelerar();  // Motor a gasolina rugindo com força!

// Se quiser mudar para elétrico, precisa criar um novo objeto
// Não há flexibilidade!
Um jogo onde cada veículo tem seu motor "hardcoded" dentro da classe, sem poder trocar dinamicamente.
📂 Estrutura UML (Antipadrão)
┌─────────────────────┐
│    Veiculo          │
├─────────────────────┤
│ - nome: String      │
│ - tipoMotor: String │
├─────────────────────┤
│ + acelerar(): void  │
│   (if-else fixo)    │
└─────────────────────┘
📋 Estrutura do Projeto

Veiculo.java - Classe com lógica fixa
Main.java - Demonstra o antipadrão em uso
README.md - Esta documentação