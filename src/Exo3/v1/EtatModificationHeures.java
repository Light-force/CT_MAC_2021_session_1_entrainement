package Exo3.v1;

public class EtatModificationHeures implements Etat {

    private Montre montre;

    public EtatModificationHeures(Montre montre) {
        this.montre = montre;
    }

    @Override
    public void actionAvance() {
        montre.modifierHeure();
    }

    @Override
    public Etat actionChangerMode() {
        return new EtatModificationMinutes(montre);
    }
}
