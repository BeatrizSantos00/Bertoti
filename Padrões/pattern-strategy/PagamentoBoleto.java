// pattern-strategy/PagamentoBoleto.java
public class PagamentoBoleto implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("📋 Pagamento por Boleto Bancário: R$ " + valor);
        System.out.println("   Gerando código de barras...");
        System.out.println("   ✓ Boleto emitido com sucesso!");
        System.out.println("   Vencimento: 3 dias úteis");
    }
}