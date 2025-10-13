// pattern-composite/Main.java
public class Main {
    public static void main(String[] args) {
        Item espada = new Item("Espada");
        Item escudo = new Item("Escudo");

        Grupo mochila = new Grupo("Mochila");
        mochila.adicionar(espada);
        mochila.adicionar(escudo);

        Grupo inventario = new Grupo("Inventário do Jogador");
        inventario.adicionar(mochila);
        inventario.exibir();
    }
}
