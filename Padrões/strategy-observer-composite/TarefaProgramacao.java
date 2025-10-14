// combined-pattern/TarefaProgramacao.java
public class TarefaProgramacao implements Tarefa {
    @Override
    public void executar(String nome) {
        System.out.println(nome + " está programando um novo módulo!");
    }
}