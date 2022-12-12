package Exo4;

public class ConnecteurY implements Accessoire {
    Accessoire a1; Accessoire a2;
    public ConnecteurY(Accessoire a1, Accessoire a2) {
        this.a1 = a1; this.a2 = a2;
    }
    public Accessoire getA1() {
        return a1;
    }
    public Accessoire getA2() {
        return a2;
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
