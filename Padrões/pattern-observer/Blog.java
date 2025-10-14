// pattern-observer/Blog.java
import java.util.ArrayList;
import java.util.List;

public class Blog implements Sujeito {
    private String nome;
    private List<Observador> seguidores = new ArrayList<>();

    public Blog(String nome) {
        this.nome = nome;
    }

    @Override
    public void inscrever(Observador o) {
        seguidores.add(o);
        System.out.println("✅ Novo seguidor adicionado!");
    }

    @Override
    public void desinscrever(Observador o) {
        seguidores.remove(o);
        System.out.println("❌ Seguidor removido!");
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observador o : seguidores) {
            o.atualizar(nome + ": " + mensagem);
        }
    }

    public void publicarArtigo(String titulo) {
        System.out.println("\n📝 " + nome + " publicou: " + titulo);
        notificarObservadores(titulo);
    }
}