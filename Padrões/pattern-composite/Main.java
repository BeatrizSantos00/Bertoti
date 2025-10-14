// pattern-composite/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== CARDÁPIO DO RESTAURANTE ===");

        // Criando pratos individuais
        Prato hamburguer = new Prato("Hambúrguer", 25.00);
        Prato pizza = new Prato("Pizza Margherita", 35.00);
        Prato salada = new Prato("Salada Grega", 20.00);

        Prato refrigerante = new Prato("Refrigerante", 8.00);
        Prato suco = new Prato("Suco Natural", 12.00);

        Prato sorvete = new Prato("Sorvete", 10.00);
        Prato bolo = new Prato("Bolo de Chocolate", 15.00);

        // Criando categorias
        Categoria pratosPrincipais = new Categoria("Pratos Principais");
        pratosPrincipais.adicionar(hamburguer);
        pratosPrincipais.adicionar(pizza);
        pratosPrincipais.adicionar(salada);

        Categoria bebidas = new Categoria("Bebidas");
        bebidas.adicionar(refrigerante);
        bebidas.adicionar(suco);

        Categoria sobremesas = new Categoria("Sobremesas");
        sobremesas.adicionar(sorvete);
        sobremesas.adicionar(bolo);

        // Criando cardápio geral (pode conter categorias e pratos)
        Categoria cardapio = new Categoria("CARDÁPIO COMPLETO");
        cardapio.adicionar(pratosPrincipais);
        cardapio.adicionar(bebidas);
        cardapio.adicionar(sobremesas);

        // ✅ PADRÃO COMPOSITE: Tratamento uniforme
        System.out.println("\n--- Exibindo Cardápio ---");
        cardapio.exibir();

        System.out.println("\n✅ PADRÃO COMPOSITE: Prato e Categoria compartilham a mesma interface!");
        System.out.println("É possível tratar ambos da mesma forma através de estruturas hierárquicas.");
    }
}