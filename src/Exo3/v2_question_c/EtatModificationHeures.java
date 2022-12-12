package Exo3.v2_question_c;

import java.util.Objects;

public class EtatModificationHeures implements Etat {
    private static Etat singleton;
    public static Etat getInstance() {
        if (Objects.isNull(singleton)) {
            singleton = new EtatModificationHeures();
        }
        return singleton;
    }
    @Override
    public Etat actionAvance(Montre montre) {
        montre.modifierHeure();
        return this;
    }
    @Override
    public Etat actionAvanceRapide(Montre montre) {
        montre.modifierHeureRapide();
        return this;
    }
    @Override
    public Etat actionChangerMode() {
        return EtatModificationMinutes.getInstance();
    }
}
