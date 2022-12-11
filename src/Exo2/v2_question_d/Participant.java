package Exo2.v2_question_d;

public class Participant implements Observer {

    private Examen examen;
    private int idParticipant;

    public Participant(Examen examen, int idParticipant) {
        this.examen = examen;
        this.idParticipant = idParticipant;
    }

    public String getQuestion(int idQuestion) {
        return examen.getListeQuestions().get(idQuestion).getQuestion();
    }

    public void ajouterReponse(int idQuestion, String reponse, Participant idReponse) {
        examen.getListeQuestions().get(idQuestion).setReponse(reponse, idReponse);
    }

    public void upVoteReponse(int idQuestion, Participant idParticipant) {
        examen.getListeQuestions().get(idQuestion).getReponseById(idParticipant).upVote(idParticipant);
    }

    public void downVoteReponse(int idQuestion, Participant idParticipant) {
        examen.getListeQuestions().get(idQuestion).getReponseById(idParticipant).downVote(idParticipant);
    }

    @Override
    public void update() {
        System.out.println("Nouvelle réponse");
    }
}
