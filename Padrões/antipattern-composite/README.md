# ❌ Antipattern Composite

## ✅ O que é
Quando não existe uma **interface comum** para objetos compostos e individuais, forçando o cliente a tratá-los de forma diferente.

## ❌ Problema
- Cliente precisa verificar manualmente se é `Arquivo` ou `Pasta`.
- Código duplicado e difícil manutenção.

## 💡 Exemplo
Sistema de arquivos onde `Arquivo` e `Pasta` não têm nada em comum.

## 📂 UML
(`Arquivo` e `Pasta` independentes, sem interface comum)

## 🌍 Aplicação real
Projetos onde listas e itens simples não compartilham interface, complicando o uso.
