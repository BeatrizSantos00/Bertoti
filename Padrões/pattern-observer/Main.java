// pattern-observer/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE BLOG COM OBSERVADORES ===\n");

        Blog blog = new Blog("Tech News Daily");

        Seguidor s1 = new Seguidor("Ana");
        Seguidor s2 = new Seguidor("Bruno");
        Seguidor s3 = new Seguidor("Carlos");

        System.out.println("--- Inscrições ---");
        blog.inscrever(s1);
        blog.inscrever(s2);
        blog.inscrever(s3);

        System.out.println("\n--- Publicações ---");
        blog.publicarArtigo("Java 21 - Novas Funcionalidades");
        
        blog.publicarArtigo("Padrões de Design Explicados");

        System.out.println("\n--- Remover seguidor ---");
        blog.desinscrever(s2);

        System.out.println("\n--- Nova publicação ---");
        blog.publicarArtigo("Spring Boot 3.0 Guide");

        System.out.println("\n✅ PADRÃO OBSERVER: Desacoplamento entre Blog (Subject) e Seguidores (Observers)!");
        System.out.println("O Blog não precisa conhecer os detalhes dos Seguidores.");
    }
}