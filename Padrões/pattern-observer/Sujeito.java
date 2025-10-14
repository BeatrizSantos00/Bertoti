// pattern-observer/Sujeito.java
public interface Sujeito {
    void inscrever(Observador o);
    void desinscrever(Observador o);
    void notificarObservadores(String mensagem);
}