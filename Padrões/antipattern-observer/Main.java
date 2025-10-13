// antipattern-observer/Canal.java
public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Igor");
        Usuario u2 = new Usuario("Lara");
        Canal canal = new Canal("Notícias do Reino");

        canal.publicar("Nova missão disponível!", u1, u2);
    }
}
