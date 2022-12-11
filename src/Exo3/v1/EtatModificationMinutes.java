package Exo3.v1;

public class EtatModificationMinutes implements Etat {

    private Montre montre;

    public EtatModificationMinutes(Montre montre) {
        this.montre = montre;
    }

    @Override
    public void actionAvance() {
        montre.modifierMinutes();
    }

    @Override
    public Etat actionChangerMode() {
        return new EtatAffichage(montre);
    }
}
