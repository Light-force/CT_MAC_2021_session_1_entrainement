package Exo2.v2_question_d;

import java.util.Map;

public interface Examen {
    Map<Integer, Question> getListeQuestions();

    void setListeQuestions(Map<Integer, Question> listeQuestions);
}
