package Exo2.v1;

import java.util.HashMap;
import java.util.Map;

public class ExamenImpl implements Examen {
    private Map<Integer, Question> listeQuestions;

    public ExamenImpl() {
        this.listeQuestions = new HashMap<>();
    }

    @Override
    public Map<Integer, Question> getListeQuestions() {
        return listeQuestions;
    }

    @Override
    public void setListeQuestions(Map<Integer, Question> listeQuestions) {
        this.listeQuestions = listeQuestions;
    }
}
