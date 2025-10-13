// strategy-observer-composite/Personagem.java
import java.util.ArrayList;
import java.util.List;

public class Personagem implements Observer, Subject {
    private String nome;
    private Ataque estrategiaAtaque;
    private List<Observer> aliados = new ArrayList<>();

    public Personagem(String nome, Ataque estrategiaAtaque) {
        this.nome = nome;
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public void atacar() {
        estrategiaAtaque.executar(nome);
        notificar(nome + " iniciou um ataque!");
    }

    @Override
    public void update(String mensagem) {
        System.out.println(nome + " recebeu atualização: " + mensagem);
    }

    @Override
    public void adicionar(Observer o) {
        aliados.add(o);
    }

    @Override
    public void notificar(String mensagem) {
        for (Observer o : aliados) {
            o.update(mensagem);
        }
    }
}
