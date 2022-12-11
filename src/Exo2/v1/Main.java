package Exo2.v1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Examen examen = new ExamenImpl();
        Question q1 = new Question("Question1");
        Question q2 = new Question("QUestion2");

        Map<Integer, Question> listeQuestions = new HashMap<>();
        listeQuestions.put(1, q1);
        listeQuestions.put(2, q2);

        examen.setListeQuestions(listeQuestions);

        Participant p = new Participant(examen);

        q1.registerObserver(p);
        q2.registerObserver(p);

        System.out.println(p.getQuestion(1));
        p.ajouterReponse(1, "Reponse1");

        System.out.println(p.getQuestion(2));
        p.ajouterReponse(2, "Reponse2");
    }
}

