package Exo3.v1;

public class EtatAffichage implements Etat {

    @Override
    public Etat modifierHeure() {
        return new EtatModificationHeures();
    }
}
