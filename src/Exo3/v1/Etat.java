package Exo3.v1;

public interface Etat {

    default void actionAvance(Montre montre) {
        throw new UnsupportedOperationException();
    }

    default Etat actionChangerMode() {
        throw new UnsupportedOperationException();
    }
}
