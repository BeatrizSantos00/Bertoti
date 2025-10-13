// strategy-observer-composite/AtaqueFisico.java
public class AtaqueFisico implements Ataque {
    @Override
    public void executar(String nome) {
        System.out.println(nome + " realiza um golpe físico devastador!");
    }
}
