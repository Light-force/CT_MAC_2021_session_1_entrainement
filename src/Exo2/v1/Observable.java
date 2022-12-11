package Exo2.v1;

public interface Observable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);
}
