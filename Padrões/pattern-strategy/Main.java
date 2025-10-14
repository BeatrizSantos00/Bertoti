// pattern-strategy/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PAGAMENTO COM STRATEGIES ===\n");

        // Criar estratégias de pagamento
        MetodoPagamento cartao = new PagamentoCartao();
        MetodoPagamento pix = new PagamentoPix();
        MetodoPagamento boleto = new PagamentoBoleto();

        // Cliente 1: Pagando com cartão
        CarrinhoCompras compra1 = new CarrinhoCompras("Ana Silva", 150.00);
        compra1.setMetodoPagamento(cartao);
        compra1.finalizarCompra();

        // Cliente 2: Pagando com PIX
        CarrinhoCompras compra2 = new CarrinhoCompras("Bruno Santos", 250.50);
        compra2.setMetodoPagamento(pix);
        compra2.finalizarCompra();

        // Cliente 3: Pagando com Boleto
        CarrinhoCompras compra3 = new CarrinhoCompras("Carlos Oliveira", 500.00);
        compra3.setMetodoPagamento(boleto);
        compra3.finalizarCompra();

        // Cliente 4: Mudando de estratégia em tempo de execução
        System.out.println("--- MUDANDO ESTRATÉGIA EM TEMPO DE EXECUÇÃO ---");
        CarrinhoCompras compra4 = new CarrinhoCompras("Diana Costa", 80.00);
        compra4.setMetodoPagamento(pix);
        System.out.println("Diana escolheu PIX inicialmente:");
        compra4.finalizarCompra();

        System.out.println("Diana mudou de ideia e quer pagar com cartão:");
        compra4.setMetodoPagamento(cartao);
        compra4.finalizarCompra();

        System.out.println("✅ PADRÃO STRATEGY: Estratégias separadas e trocáveis em tempo real!");
        System.out.println("Sem código duplicado, sem if-else, fácil de estender!");
    }
}