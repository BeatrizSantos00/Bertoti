// antipattern-composite/Main.java
public class Main {
    public static void main(String[] args) {
        Item espada = new Item("Espada");
        Item escudo = new Item("Escudo");

        Grupo grupo = new Grupo("Equipamentos");
        grupo.adicionar(espada);
        grupo.adicionar(escudo);

       
        espada.exibir();
        escudo.exibir();
        grupo.exibir();
    }
}
