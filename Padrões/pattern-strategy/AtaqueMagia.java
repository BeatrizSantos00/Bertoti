// pattern-strategy/AtaqueMagia.java
public class AtaqueMagia implements Atacar {
    @Override
    public void atacar(String nome) {
        System.out.println(nome + " conjura uma explosão mágica!");
    }
}
