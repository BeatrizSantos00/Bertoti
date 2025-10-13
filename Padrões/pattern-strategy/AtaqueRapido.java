// pattern-strategy/AtaqueRapido.java
public class AtaqueRapido implements Atacar {
    @Override
    public void atacar(String nome) {
        System.out.println(nome + " realiza um ataque rápido e preciso!");
    }
}
