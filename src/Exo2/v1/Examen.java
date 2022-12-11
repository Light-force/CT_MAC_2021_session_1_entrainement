package Exo2.v1;

import java.util.Map;

public interface Examen {
    Map<Integer, Question> getListeQuestions();

    void setListeQuestions(Map<Integer, Question> listeQuestions);
}
