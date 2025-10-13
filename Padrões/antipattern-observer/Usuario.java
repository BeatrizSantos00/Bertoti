// antipattern-observer/Usuario.java
public class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void receberMensagem(String canal, String mensagem) {
        System.out.println(nome + " recebeu notificação de " + canal + ": " + mensagem);
    }
}
