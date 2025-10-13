# 💡 Padrão Strategy

## ✅ O que é
O **Strategy** separa comportamentos em **interfaces** e **implementações específicas**, permitindo que sejam trocados em tempo de execução.

## ❌ Problema resolvido
- Evita código duplicado.
- Facilita a manutenção.
- Permite adicionar novos comportamentos sem alterar o código existente.

## 💡 Exemplo
Cada `Personagem` pode ter uma `EstrategiaDeAtaque` diferente (espada, arco, magia), e pode mudar em tempo de execução.

## 📂 UML
(Interface `Ataque` → implementações `AtaqueEspada`, `AtaqueArco`; classe `Personagem` usa uma referência a `Ataque`)

## 🌍 Aplicação real
Sistemas de pagamento: você pode trocar a estratégia de pagamento (`Cartão`, `PIX`, `Boleto`) sem mudar a lógica principal.
