// pattern-observer/Usuario.java
public class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("🔔 " + nome + " recebeu: " + mensagem);
    }
}
