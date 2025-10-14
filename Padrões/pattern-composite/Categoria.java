// pattern-composite/Categoria.java
import java.util.ArrayList;
import java.util.List;

public class Categoria implements Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Categoria(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente c) {
        componentes.add(c);
    }

    public void remover(Componente c) {
        componentes.remove(c);
    }

    @Override
    public void exibir() {
        System.out.println("\n📂 " + nome);
        for (Componente c : componentes) {
            c.exibir();
        }
    }
}