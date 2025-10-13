// strategy-observer-composite/Main.java
public class Main {
    public static void main(String[] args) {
        Ataque fisico = new AtaqueFisico();
        Ataque magico = new AtaqueMagico();

        Personagem lysandre = new Personagem("Lysandre", fisico);
        Personagem selene = new Personagem("Selene", magico);

        Grupo grupo = new Grupo("Aventuras Carmesins");

        lysandre.adicionar(selene); // Observer
        selene.adicionar(grupo);    // Composite + Observer

        lysandre.atacar();
        selene.atacar();
    }
}
