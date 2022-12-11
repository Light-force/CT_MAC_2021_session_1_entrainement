package Exo3.v1;

public interface Etat {

    default Etat modifierHeure() {
        throw new UnsupportedOperationException();
    }

    default Etat modifierMinutes() {
        throw new UnsupportedOperationException();
    }

    default Etat passerEnAffichage() {
        throw new UnsupportedOperationException();
    }
}
