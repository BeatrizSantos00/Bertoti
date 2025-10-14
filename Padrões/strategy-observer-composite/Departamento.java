// combined-pattern/Departamento.java
import java.util.ArrayList;
import java.util.List;

public class Departamento implements Observador {
    private String nome;
    private List<Funcionario> membros = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario f) {
        membros.add(f);
    }

    public void exibir() {
        System.out.println("\n📂 Departamento: " + nome);
        for (Funcionario f : membros) {
            System.out.println("  - " + f);
        }
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("[" + nome + "] recebeu notificação: " + mensagem);
    }
}