// combined-pattern/TarefaDesign.java
public class TarefaDesign implements Tarefa {
    @Override
    public void executar(String nome) {
        System.out.println(nome + " está criando designs e mockups!");
    }
}