// antipattern-strategy/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE VEÍCULOS ===\n");

        Veiculo v1 = new Veiculo("Ferrari", "Gasolina");
        Veiculo v2 = new Veiculo("Tesla", "Elétrico");
        Veiculo v3 = new Veiculo("Volvo", "Diesel");
        Veiculo v4 = new Veiculo("Prius", "Híbrido");

        System.out.println("--- Primeiro turno ---");
        v1.acelerar();
        v2.acelerar();
        v3.acelerar();
        v4.acelerar();

        System.out.println("\n--- Segundo turno ---");
        v1.acelerar();
        v2.acelerar();

        System.out.println("\n❌ ANTIPADRÃO: Lógica de comportamento fixa na classe!");
        System.out.println("Não é possível trocar o tipo de motor sem criar um novo objeto.");
        System.out.println("Código duplicado em vários if-else.\n");
    }
}