// combined-pattern/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE EMPRESA - STRATEGY + OBSERVER + COMPOSITE ===\n");

        // Criar estratégias (Strategy)
        Tarefa programacao = new TarefaProgramacao();
        Tarefa design = new TarefaDesign();

        // Criar funcionários com estratégias iniciais
        Funcionario joao = new Funcionario("João", programacao);
        Funcionario maria = new Funcionario("Maria", design);

        // Criar departamento (Composite)
        Departamento desenvolvimento = new Departamento("Desenvolvimento");
        desenvolvimento.adicionarFuncionario(joao);
        desenvolvimento.adicionarFuncionario(maria);

        // Adionar observadores (Observer)
        // João observa Maria
        joao.adicionarObservador(maria);
        // Maria observa o departamento
        maria.adicionarObservador(desenvolvimento);

        System.out.println("--- Exibindo estrutura ---");
        desenvolvimento.exibir();

        System.out.println("\n--- Primeiro turno de trabalho ---");
        joao.trabalhar();
        maria.trabalhar();

        System.out.println("\n--- Mudando estratégia de João (Strategy em tempo real) ---");
        joao.setEstrategiaTarefa(design);
        joao.trabalhar();

        System.out.println("\n--- Segundo turno ---");
        maria.trabalhar();

        System.out.println("\n✅ COMBINAÇÃO DE PADRÕES:");
        System.out.println("  • Strategy: Cada funcionário tem uma tarefa trocável");
        System.out.println("  • Observer: Funcionários são notificados sobre mudanças");
        System.out.println("  • Composite: Departamento contém funcionários (hierarquia)");
    }
}