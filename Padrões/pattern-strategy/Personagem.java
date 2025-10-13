// pattern-strategy/Personagem.java
public class Personagem {
    private String nome;
    private Atacar estrategiaAtaque; // referência à Strategy

    public Personagem(String nome, Atacar estrategiaAtaque) {
        this.nome = nome;
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public void setEstrategiaAtaque(Atacar estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public void atacar() {
        if (estrategiaAtaque == null) {
            System.out.println(nome + " não tem estratégia de ataque definida.");
        } else {
            estrategiaAtaque.atacar(nome);
        }
    }
}
