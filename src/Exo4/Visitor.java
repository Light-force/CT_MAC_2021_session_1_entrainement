package Exo4;

public interface Visitor {
    void visit(Gouteur g);
    void visit(ConnecteurY cy);
    void visit(ConnecteurX cx);
}
