// combined-pattern/Sujeito.java
public interface Sujeito {
    void adicionarObservador(Observador o);
    void notificarObservadores(String mensagem);
}