// pattern-strategy/Main.java
public class Main {
    public static void main(String[] args) {
        // criar estratégias
        Atacar forte = new AtaqueForte();
        Atacar rapido = new AtaqueRapido();
        Atacar magia = new AtaqueMagia();

        // criar personagens com estratégias iniciais
        Personagem tank = new Personagem("Brom", forte);
        Personagem assassino = new Personagem("Lyra", rapido);
        Personagem mago = new Personagem("Eldin", magia);

        // executar ataques
        tank.atacar();
        assassino.atacar();
        mago.atacar();

        // trocar estratégia em tempo de execução
        System.out.println("\nLyra encontra uma espada pesada e muda de estratégia:");
        assassino.setEstrategiaAtaque(forte);
        assassino.atacar();
    }
}
