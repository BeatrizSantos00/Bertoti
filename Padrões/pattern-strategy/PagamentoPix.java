// pattern-strategy/PagamentoPix.java
public class PagamentoPix implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("📱 Pagamento por PIX: R$ " + valor);
        System.out.println("   Gerando QR Code...");
        System.out.println("   ✓ Pagamento instantâneo confirmado!");
    }
}