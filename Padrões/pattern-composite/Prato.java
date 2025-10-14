// pattern-composite/Prato.java
public class Prato implements Componente {
    private String nome;
    private double preco;

    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void exibir() {
        System.out.println("  🍽️ " + nome + " - R$ " + preco);
    }
}