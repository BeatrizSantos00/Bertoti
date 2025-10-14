// antipattern-observer/Restaurante.java
public class Restaurante {
    private String nome;
    private String promocao;

    public Restaurante(String nome) {
        this.nome = nome;
    }

    // Notificação manual e acoplada — antipadrão
    public void lancarPromo(String promocao, Cliente cliente1, Cliente cliente2, Cliente cliente3) {
        this.promocao = promocao;
        System.out.println("\n" + nome + " lançou promoção: " + promocao);
        cliente1.receberPromo(nome, promocao);
        cliente2.receberPromo(nome, promocao);
        cliente3.receberPromo(nome, promocao);
    }
}