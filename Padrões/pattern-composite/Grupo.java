// pattern-composite/Grupo.java
import java.util.ArrayList;
import java.util.List;

public class Grupo implements Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Grupo(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente c) {
        componentes.add(c);
    }

    @Override
    public void exibir() {
        System.out.println("Grupo: " + nome);
        for (Componente c : componentes) {
            c.exibir();
        }
    }
}
