// antipattern-composite/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE BIBLIOTECA ===\n");

        // Criando livros individuais
        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        Livro livro4 = new Livro("Neuromancer", "William Gibson");

        // Criando prateleiras
        Prateleira ficcao = new Prateleira("Ficção Científica");
        ficcao.adicionar(livro1);
        ficcao.adicionar(livro4);

        Prateleira literatura = new Prateleira("Literatura Brasileira");
        literatura.adicionar(livro2);
        literatura.adicionar(livro3);

        // ❌ PROBLEMA: Cliente precisa tratar Livro e Prateleira diferentemente
        System.out.println("--- Exibindo livros individuais ---");
        livro1.exibir();
        livro2.exibir();

        System.out.println("\n--- Exibindo prateleiras ---");
        ficcao.exibir();
        literatura.exibir();

        System.out.println("\n❌ ANTIPADRÃO: Livro e Prateleira não compartilham interface comum!");
        System.out.println("A mesma operação 'exibir()' precisou ser chamada de formas diferentes.");
    }
}