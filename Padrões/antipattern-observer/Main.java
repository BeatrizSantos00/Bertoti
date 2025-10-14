// antipattern-observer/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PROMOÇÕES DE RESTAURANTE ===\n");

        Cliente c1 = new Cliente("Alice");
        Cliente c2 = new Cliente("Bruno");
        Cliente c3 = new Cliente("Carlos");

        Restaurante pizzaria = new Restaurante("Pizzaria Italiana");

        // ❌ PROBLEMA: Precisa passar cada cliente manualmente
        pizzaria.lancarPromo("30% de desconto em pizzas!", c1, c2, c3);

        System.out.println("\n--- Segunda Promoção ---");
        pizzaria.lancarPromo("Compre 2 e ganhe 1 sobremesa!", c1, c2, c3);

        // ❌ Se adicionar mais um cliente, precisa modificar o método
        Cliente c4 = new Cliente("Diana");
        // Não consegue adicionar c4 sem mudar a assinatura do método!

        System.out.println("\n❌ ANTIPADRÃO: Restaurante está acoplado aos clientes específicos!");
        System.out.println("Não há desacoplamento entre publicador e observadores.");
    }
}