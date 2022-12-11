package Exo2.v2_question_d;

import java.util.ArrayList;
import java.util.Collection;

public class Question implements Observable {
    private String question;
    private Collection<Reponse> listeReponses;
    private Collection<Observer> observers;

    public Question(String question) {
        this.question = question;
        this.observers = new ArrayList<>();
        this.listeReponses = new ArrayList<>();
    }

    public String getQuestion() {
        return question;
    }

    public Reponse getReponseById(Participant idReponse) {
        return listeReponses.stream().filter(reponse -> reponse.getIdReponse() == idReponse).findFirst().orElseThrow();
    }

    public void setReponse(String reponse, Participant participant) {
        if (listeReponses.stream().anyMatch(r -> r.getReponse().equals(reponse)))
            listeReponses.stream().filter(r -> r.getReponse().equals(reponse)).findFirst().orElseThrow().upVote(participant);
        else {
            listeReponses.add(new Reponse(participant, reponse));
            notifyObserver();
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        observers.forEach(Observer::update);
    }
}
