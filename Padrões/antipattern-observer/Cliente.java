// antipattern-observer/Cliente.java
public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void receberPromo(String restaurante, String promocao) {
        System.out.println(nome + " recebeu promoção de " + restaurante + ": " + promocao);
    }
}