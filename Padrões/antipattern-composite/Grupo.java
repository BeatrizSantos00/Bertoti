// antipattern-composite/Grupo.java
import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Item> itens = new ArrayList<>();

    public Grupo(String nome) {
        this.nome = nome;
    }

    public void adicionar(Item item) {
        itens.add(item);
    }

    public void exibir() {
        System.out.println("Grupo: " + nome);
        for (Item i : itens) {
            i.exibir();
        }
    }
}
