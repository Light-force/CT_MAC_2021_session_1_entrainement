package Exo3.v2_question_c;

public interface Etat {
    Etat actionAvance(Montre montre);
    Etat actionAvanceRapide(Montre montre);
    Etat actionChangerMode();
}
