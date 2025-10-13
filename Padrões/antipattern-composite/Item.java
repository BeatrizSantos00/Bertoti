// antipattern-composite/Item.java
public class Item {
    private String nome;

    public Item(String nome) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.println("Item: " + nome);
    }
}
