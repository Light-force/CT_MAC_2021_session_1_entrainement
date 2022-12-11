package Exo2.v2_question_d;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Examen examen = new ExamenImpl();
        Question q1 = new Question("Question1");
        Question q2 = new Question("Question2");

        Map<Integer, Question> listeQuestions = new HashMap<>();
        listeQuestions.put(1, q1);
        listeQuestions.put(2, q2);

        examen.setListeQuestions(listeQuestions);

        Participant p = new Participant(examen, 2131865);
        Participant p2 = new Participant(examen, 5681312);

        q1.registerObserver(p);
        q2.registerObserver(p);

        System.out.println(p.getQuestion(1));
        p.ajouterReponse(1, "Reponse1", p);

        System.out.println(p.getQuestion(2));
        p.ajouterReponse(2, "Reponse2", p);

        System.out.println(q1.getReponseById(p).getNbVote());
        p2.upVoteReponse(1, p);
        System.out.println(q1.getReponseById(p).getNbVote());
    }
}
