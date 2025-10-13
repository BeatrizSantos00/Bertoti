// pattern-observer/Subject.java
public interface Subject {
    void adicionar(Observer o);
    void remover(Observer o);
    void notificar(String mensagem);
}
