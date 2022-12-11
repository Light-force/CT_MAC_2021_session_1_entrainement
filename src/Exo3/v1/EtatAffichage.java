package Exo3.v1;

import java.util.Objects;

public class EtatAffichage implements Etat {

    private static Etat singleton;

    public static Etat getInstance() {
        if (Objects.isNull(singleton)) {
            singleton = new EtatAffichage();
        }
        return singleton;
    }

    @Override
    public Etat actionChangerMode() {
        return EtatModificationHeures.getInstance();
    }
}
