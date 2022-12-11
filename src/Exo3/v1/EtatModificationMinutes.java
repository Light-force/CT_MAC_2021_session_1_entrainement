package Exo3.v1;

import java.util.Objects;

public class EtatModificationMinutes implements Etat {

    private static Etat singleton;

    public static Etat getInstance() {
        if (Objects.isNull(singleton)) {
            singleton = new EtatModificationMinutes();
        }
        return singleton;
    }

    @Override
    public void actionAvance(Montre montre) {
        montre.modifierMinutes();
    }

    @Override
    public Etat actionChangerMode() {
        return EtatAffichage.getInstance();
    }
}
