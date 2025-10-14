💡 Padrão Strategy - Sistema de Pagamento
✅ O que é
O Strategy separa comportamentos em interfaces e implementações específicas, permitindo que sejam trocados em tempo de execução.
✅ Problema resolvido

Evita código duplicado (sem if-else)
Facilita a manutenção
Permite adicionar novos comportamentos sem alterar o código existente
Flexibilidade para trocar estratégias dinamicamente
Respeita o princípio Open/Closed

💡 Exemplo
Um carrinho de compras que pode processar pagamentos de diferentes formas (Cartão, PIX, Boleto), e pode mudar em tempo de execução.
📂 Estrutura UML
           ┌──────────────────────┐
           │ <<interface>>        │
           │ MetodoPagamento      │
           │──────────────────────│
           │ + pagar(valor): void │
           └──────────┬───────────┘
                      △
                      │
        ┌─────────────┼─────────────┐
        │             │             │
   ┌─────────┐  ┌──────────┐  ┌──────────┐
   │Cartão   │  │   PIX    │  │ Boleto   │
   └─────────┘  └──────────┘  └──────────┘

┌─────────────────────┐
│ CarrinhoCompras     │
├─────────────────────┤
│ - cliente           │
│ - total             │
│ - metodo: Strategy  │ ────→ Usa a Strategy!
├─────────────────────┤
│ + setMetodo()       │
│ + finalizarCompra() │
└─────────────────────┘
📋 Estrutura do Projeto

MetodoPagamento.java - Interface para estratégias
PagamentoCartao.java - Implementação para cartão
PagamentoPix.java - Implementação para PIX
PagamentoBoleto.java - Implementação para boleto
CarrinhoCompras.java - Classe que usa as estratégias
Main.java - Demonstra o padrão em uso
README.md - Esta documentação