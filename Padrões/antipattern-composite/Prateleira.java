// antipattern-composite/Prateleira.java
import java.util.ArrayList;
import java.util.List;

public class Prateleira {
    private String categoria;
    private List<Livro> livros = new ArrayList<>();

    public Prateleira(String categoria) {
        this.categoria = categoria;
    }

    public void adicionar(Livro livro) {
        livros.add(livro);
    }

    public void exibir() {
        System.out.println("\n📚 Prateleira: " + categoria);
        for (Livro l : livros) {
            l.exibir();
        }
    }
}