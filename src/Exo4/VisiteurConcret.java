package Exo4;

public class VisiteurConcret implements Visitor{
    private float eau;
    private String result;
    public VisiteurConcret(float eau) {
        this.eau = eau;
    }
    @Override
    public void visit(Gouteur g) {
        this.result = "Goutteur : " + eau;
    }
    @Override
    public void visit(ConnecteurX cx) {
        Accessoire a1 = cx.getA1();
        Accessoire a2 = cx.getA2();
        Accessoire a3 = cx.getA3();
        VisiteurConcret v1 = new VisiteurConcret(eau / 3); a1.accept(v1);
        VisiteurConcret v2 = new VisiteurConcret(eau/3); a2.accept(v2);
        VisiteurConcret v3 = new VisiteurConcret(eau/3); a3.accept(v3);
        this.result = v1.getResult() + ", " + v2.getResult() + ", " + v3.getResult();
    }
    @Override
    public void visit(ConnecteurY cy) {
        Accessoire a1 = cy.getA1();
        Accessoire a2 = cy.getA2();
        VisiteurConcret v1 = new VisiteurConcret(eau / 2); a1.accept(v1);
        VisiteurConcret v2 = new VisiteurConcret(eau/2); a2.accept(v2);
        this.result = v1.getResult() + ", " + v2.getResult();
    }
    public String getResult() {
        return result;
    }
}
