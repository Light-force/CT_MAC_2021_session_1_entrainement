package Exo3.v2_question_c;

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
    public Etat actionAvance(Montre montre) {
        montre.modifierMinutes();
        return this;
    }

    @Override
    public Etat actionAvanceRapide(Montre montre) {
        montre.modifierMinutesRapide();
        return this;
    }

    @Override
    public Etat actionChangerMode() {
        return EtatModificationSecondes.getInstance();
    }
}
