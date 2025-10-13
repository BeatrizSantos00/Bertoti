// pattern-strategy/AtaqueForte.java
public class AtaqueForte implements Atacar {
    @Override
    public void atacar(String nome) {
        System.out.println(nome + " desfere um ataque poderoso com enorme força!");
    }
}
