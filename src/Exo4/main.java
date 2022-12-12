package Exo4;

public class main {
    public static void main(String[] args) {
        Accessoire accessoire = new ConnecteurY(
                new ConnecteurX(
                        new Gouteur(),
                        new Gouteur(),
                        new Gouteur()
                ),
                new ConnecteurX(
                        new Gouteur(),
                        new Gouteur(),
                        new Gouteur()
                )
        );
        VisiteurConcret visiteurConcret = new VisiteurConcret(10);
        accessoire.accept(visiteurConcret);
        System.out.println(visiteurConcret.getResult());
    }
}
