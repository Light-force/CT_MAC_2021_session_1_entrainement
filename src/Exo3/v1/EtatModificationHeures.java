package Exo3.v1;

public class EtatModificationHeures implements Etat {

    @Override
    public Etat modifierMinutes() {
        return new EtatModificationMinutes();
    }
}
