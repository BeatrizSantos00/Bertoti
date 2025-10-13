// antipattern-observer/Canal.java
public class Canal {
    private String nome;
    private String mensagem;

    public Canal(String nome) {
        this.nome = nome;
    }

    // Notificação manual e acoplada — antipadrão
    public void publicar(String mensagem, Usuario usuario1, Usuario usuario2) {
        this.mensagem = mensagem;
        System.out.println(nome + " publicou: " + mensagem);
        usuario1.receberMensagem(nome, mensagem);
        usuario2.receberMensagem(nome, mensagem);
    }
}
