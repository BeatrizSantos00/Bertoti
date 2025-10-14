💡 Padrão Composite - Sistema de Cardápio
✅ O que é
O Composite cria uma interface comum para objetos simples e compostos, permitindo tratá-los da mesma forma.
✅ Problema resolvido

Cliente não precisa diferenciar Prato e Categoria.
Permite estruturas hierárquicas e recursivas.
Código mais limpo e reutilizável.
Possibilita trabalhar com coleções heterogêneas de objetos.

💡 Exemplo
Sistema de cardápio onde Prato e Categoria implementam a mesma interface Componente, permitindo que categorias contenham outras categorias ou pratos individuais.
📂 Estrutura UML
           ┌─────────────────────────┐
           │   <<interface>>         │
           │    Componente           │
           │─────────────────────────│
           │  + exibir(): void       │
           └──────────┬──────────────┘
                      ▲
                      │
         ┌────────────┴────────────┐
         │                         │
    ┌────────────┐          ┌──────────────┐
    │   Prato    │          │  Categoria   │
    ├────────────┤          ├──────────────┤
    │ - nome     │          │ - nome       │
    │ - preco    │          │ - componentes│
    ├────────────┤          ├──────────────┤
    │+ exibir()  │          │+ adicionar() │
    └────────────┘          │+ remover()   │
                            │+ exibir()    │
                            └──────────────┘
📋 Estrutura do Projeto

Componente.java - Interface comum
Prato.java - Classe para objetos simples (folhas)
Categoria.java - Classe para objetos compostos (nós)
Main.java - Demonstra o padrão em uso
README.md - Esta documentação