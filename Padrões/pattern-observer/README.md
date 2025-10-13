# 💡 Padrão Observer

## ✅ O que é
O **Observer** permite que múltiplos objetos (observadores) sejam notificados automaticamente quando outro objeto (sujeito) muda seu estado.

## ❌ Problema resolvido
- Desacopla o sujeito dos observadores.
- Fácil adicionar/remover observadores.
- Mais flexível e reutilizável.

## 💡 Exemplo
Uma loja que mantém uma lista de clientes e os notifica automaticamente quando há uma promoção.

## 📂 UML
- Interface `Observer` (com método `update`)
- Interface `Subject` (com métodos `add`, `remove`, `notify`)
- Classe `Loja` (implementa `Subject`)
- Classe `Cliente` (implementa `Observer`)

## 🌍 Aplicação real
Sistemas de notificação (ex.: YouTube notificando inscritos quando sai vídeo novo).
