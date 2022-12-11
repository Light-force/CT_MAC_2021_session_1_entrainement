package Exo3.v1;

public class EtatAffichage implements Etat {

    private Montre montre;

    public EtatAffichage(Montre montre) {
        this.montre = montre;
    }

    @Override
    public Etat actionChangerMode() {
        return new EtatModificationHeures(montre);
    }
}
