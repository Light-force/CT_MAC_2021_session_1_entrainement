package Exo4;

public class Gouteur implements Accessoire{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
