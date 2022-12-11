package Exo2.v2_question_d;

import java.util.ArrayList;
import java.util.Collection;

public class Reponse {

    private Participant idReponse;
    private String reponse;
    private int nbVote;
    private Collection<Participant> listeParticipantsDejaVote;

    public Reponse(Participant idParticipant, String reponse) {
        this.idReponse = idParticipant;
        this.reponse = reponse;
        this.nbVote = 0;
        this.listeParticipantsDejaVote = new ArrayList<>();
    }

    public Participant getIdReponse() {
        return idReponse;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse, Participant participant) {
        this.reponse = reponse;
        listeParticipantsDejaVote.add(participant);
    }

    public int getNbVote() {
        return nbVote;
    }

    public void upVote(Participant participant) {
        if (listeParticipantsDejaVote.contains(participant))
            System.out.println("Vous avez déjà voté.");
        else {
            this.nbVote++;
            listeParticipantsDejaVote.add(participant);
        }
    }

    public void downVote(Participant participant) {
        if (listeParticipantsDejaVote.contains(participant))
            System.out.println("Vous avez déjà voté.");
        else {
            this.nbVote--;
            listeParticipantsDejaVote.add(participant);
        }
    }
}
