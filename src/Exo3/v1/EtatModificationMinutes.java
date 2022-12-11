package Exo3.v1;

public class EtatModificationMinutes implements Etat {

    @Override
    public Etat passerEnAffichage() {
        return new EtatAffichage();
    }
}
