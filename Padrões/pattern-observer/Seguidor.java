// pattern-observer/Seguidor.java
public class Seguidor implements Observador {
    private String nome;

    public Seguidor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("🔔 " + nome + " recebeu notificação: " + mensagem);
    }
}