// pattern-strategy/PagamentoCartao.java
public class PagamentoCartao implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("💳 Pagamento por Cartão de Crédito: R$ " + valor);
        System.out.println("   Processando transação no banco...");
        System.out.println("   ✓ Pagamento aprovado com sucesso!");
    }
}