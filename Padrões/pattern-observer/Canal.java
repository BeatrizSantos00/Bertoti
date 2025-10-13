// pattern-observer/Canal.java
import java.util.ArrayList;
import java.util.List;

public class Canal implements Subject {
    private String nome;
    private List<Observer> inscritos = new ArrayList<>();

    public Canal(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionar(Observer o) {
        inscritos.add(o);
    }

    @Override
    public void remover(Observer o) {
        inscritos.remove(o);
    }

    @Override
    public void notificar(String mensagem) {
        for (Observer o : inscritos) {
            o.update(nome + ": " + mensagem);
        }
    }

    public void publicar(String mensagem) {
        System.out.println("📢 " + nome + " publicou: " + mensagem);
        notificar(mensagem);
    }
}
