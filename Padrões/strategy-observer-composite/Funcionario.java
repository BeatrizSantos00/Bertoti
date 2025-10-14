// combined-pattern/Funcionario.java
import java.util.ArrayList;
import java.util.List;

public class Funcionario implements Observador, Sujeito {
    private String nome;
    private Tarefa estrategiaTarefa;
    private List<Observador> colegas = new ArrayList<>();

    public Funcionario(String nome, Tarefa estrategiaTarefa) {
        this.nome = nome;
        this.estrategiaTarefa = estrategiaTarefa;
    }

    public void setEstrategiaTarefa(Tarefa estrategiaTarefa) {
        this.estrategiaTarefa = estrategiaTarefa;
    }

    public void trabalhar() {
        estrategiaTarefa.executar(nome);
        notificarObservadores(nome + " iniciou uma nova tarefa!");
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu notificação: " + mensagem);
    }

    @Override
    public void adicionarObservador(Observador o) {
        colegas.add(o);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observador o : colegas) {
            o.atualizar(mensagem);
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}