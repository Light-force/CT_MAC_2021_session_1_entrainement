package Exo2.v1;

public class Participant implements Observer {

    private Examen examen;

    public Participant(Examen examen) {
        this.examen = examen;
    }

    public String getQuestion(int idQuestion) {
        return examen.getListeQuestions().get(idQuestion).getQuestion();
    }

    public void ajouterReponse(int idQuestion, String reponse) {
        examen.getListeQuestions().get(idQuestion).setReponse(reponse);
    }

    @Override
    public void update(String message) {
        System.out.println("Nouvelle réponse");
    }
}
