// pattern-strategy/CarrinhoCompras.java
public class CarrinhoCompras {
    private String cliente;
    private double total;
    private MetodoPagamento metodoPagamento; // referência à Strategy

    public CarrinhoCompras(String cliente, double total) {
        this.cliente = cliente;
        this.total = total;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void finalizarCompra() {
        System.out.println("\n=== FINALIZANDO COMPRA ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Total: R$ " + total);
        System.out.println();

        if (metodoPagamento == null) {
            System.out.println("❌ Nenhum método de pagamento selecionado!");
        } else {
            metodoPagamento.pagar(total);
        }

        System.out.println();
    }
}