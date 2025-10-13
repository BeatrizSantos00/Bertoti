// strategy-observer-composite/AtaqueMagico.java
public class AtaqueMagico implements Ataque {
    @Override
    public void executar(String nome) {
        System.out.println(nome + " conjura uma magia de fogo!");
    }
}
