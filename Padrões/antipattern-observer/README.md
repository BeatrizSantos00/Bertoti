# ❌ Antipattern Observer

## ✅ O que é
Quando não existe desacoplamento entre quem **envia** a informação (sujeito) e quem **recebe** (observadores).  

## ❌ Problema
- Toda vez que a loja muda, precisa chamar manualmente cada cliente.
- Alto acoplamento: se mudar a forma de notificação, precisa mudar todos os pontos do código.

## 💡 Exemplo
Uma loja que chama diretamente o método de cada cliente para avisar sobre promoções.

## 📂 UML
(Classe `Loja` chamando diretamente `Cliente`)

## 🌍 Aplicação real
Aplicativos que não usam eventos/notificações, mas sim chamadas diretas de métodos.
