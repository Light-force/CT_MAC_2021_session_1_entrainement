package Exo2.v1;

import java.util.ArrayList;
import java.util.Collection;

public class Question implements Observable {
    private String question;
    private String reponse;
    private Collection<Observer> observers;

    public Question(String question) {
        this.question = question;
        observers = new ArrayList<>();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
        notifyObserver();
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
        observers.forEach(observer -> observer.update(this.getReponse()));
    }
}
