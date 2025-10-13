# 💡 Padrão Composite

## ✅ O que é
O **Composite** cria uma interface comum para objetos simples e compostos, permitindo tratá-los da mesma forma.

## ❌ Problema resolvido
- Cliente não precisa diferenciar `Arquivo` e `Pasta`.
- Permite estruturas hierárquicas.
- Código mais limpo e reutilizável.

## 💡 Exemplo
Sistema de arquivos onde `Arquivo` e `Pasta` implementam a mesma interface `Componente`.

## 📂 UML
- Interface `Componente`
- Classe `Arquivo` (implementa `Componente`)
- Classe `Pasta` (implementa `Componente`, pode conter outros `Componente`)

## 🌍 Aplicação real
Sistemas de menu (menu pode conter item simples ou submenu).
