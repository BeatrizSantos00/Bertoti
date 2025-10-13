// antipattern-strategy/Personagem.java
public class Personagem {
    private String nome;
    private String tipoAtaque;

    public Personagem(String nome, String tipoAtaque) {
        this.nome = nome;
        this.tipoAtaque = tipoAtaque;
    }

    public void atacar() {
        System.out.print(nome + " ataca: ");
        if ("espada".equalsIgnoreCase(tipoAtaque)) {
            System.out.println("Golpe com espada!");
        } else if ("arco".equalsIgnoreCase(tipoAtaque)) {
            System.out.println("Flecha disparada!");
        } else if ("magia".equalsIgnoreCase(tipoAtaque)) {
            System.out.println("Bola de fogo lançada!");
        } else {
            System.out.println("Tentativa de ataque desconhecida...");
        }
    }

    public static void main(String[] args) {
        Personagem p1 = new Personagem("Arthur", "Espada");
        Personagem p2 = new Personagem("Robin", "Arco");
        Personagem p3 = new Personagem("Merlin", "Magia");

        p1.atacar();
        p2.atacar();
        p3.atacar();

    }
}
