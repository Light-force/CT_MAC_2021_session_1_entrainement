package Exo3.v2_question_c;

import java.util.Objects;

public class EtatModificationSecondes implements Etat {

    private static Etat singleton;

    public static Etat getInstance() {
        if (Objects.isNull(singleton)) {
            singleton = new EtatModificationSecondes();
        }
        return singleton;
    }

    @Override
    public Etat actionAvance(Montre montre) {
        montre.modifierSecondes();
        return this;
    }

    @Override
    public Etat actionAvanceRapide(Montre montre) {
        montre.bip();
        return this;
    }

    @Override
    public Etat actionChangerMode() {
        return EtatAffichage.getInstance();
    }
}
