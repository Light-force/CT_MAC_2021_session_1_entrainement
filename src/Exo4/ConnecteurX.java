package Exo4;

public class ConnecteurX implements Accessoire {
    Accessoire a1;
    Accessoire a2;
    Accessoire a3;

    public ConnecteurX(Accessoire a1, Accessoire a2, Accessoire a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public Accessoire getA1() {
        return a1;
    }

    public Accessoire getA2() {
        return a2;
    }

    public Accessoire getA3() {
        return a3;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
