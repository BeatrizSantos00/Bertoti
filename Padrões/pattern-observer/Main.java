// pattern-observer/Main.java
public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal("Guilda dos Aventureiros");

        Usuario u1 = new Usuario("Lysandre");
        Usuario u2 = new Usuario("Selene");

        canal.adicionar(u1);
        canal.adicionar(u2);

        canal.publicar("Um novo dragão apareceu a leste!");
    }
}
