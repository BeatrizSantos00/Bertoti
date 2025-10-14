// antipattern-strategy/Veiculo.java
public class Veiculo {
    private String nome;
    private String tipoMotor;

    public Veiculo(String nome, String tipoMotor) {
        this.nome = nome;
        this.tipoMotor = tipoMotor;
    }

    public void acelerar() {
        System.out.print(nome + " acelerando: ");
        if ("gasolina".equalsIgnoreCase(tipoMotor)) {
            System.out.println("Motor a gasolina rugindo com força!");
        } else if ("eletrico".equalsIgnoreCase(tipoMotor)) {
            System.out.println("Motor elétrico operando silenciosamente!");
        } else if ("diesel".equalsIgnoreCase(tipoMotor)) {
            System.out.println("Motor diesel trabalhando com potência!");
        } else if ("hibrido".equalsIgnoreCase(tipoMotor)) {
            System.out.println("Motor híbrido alternando entre gasolina e elétrico!");
        } else {
            System.out.println("Tipo de motor desconhecido...");
        }
    }
}