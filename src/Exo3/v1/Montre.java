package Exo3.v1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Montre {

    private Etat etatCourant;
    private final SimpleDateFormat dateFormat;
    private final Calendar calendar;
    private Date heure;

    public Montre() {
        etatCourant = EtatAffichage.getInstance();
        dateFormat = new SimpleDateFormat("HH:mm");
        calendar = Calendar.getInstance();
        heure = new Date();
        System.out.println(dateFormat.format(heure));
    }

    public void setEtatCourant(Etat etatCourant) {
        this.etatCourant = etatCourant;
    }

    public void appuyerBoutonMode() {
        setEtatCourant(etatCourant.actionChangerMode());
    }

    public void appuyerBoutonAvance() {
        etatCourant.actionAvance(this);
    }

    public void modifierHeure() {
        System.out.println("Modification de l'heure :\n" + dateFormat.format(heure));
        calendar.add(Calendar.HOUR, 1);
        heure = calendar.getTime();
        System.out.println(dateFormat.format(heure));
    }

    public void modifierMinutes() {
        System.out.println("Modification des minutes :\n" + dateFormat.format(heure));
        calendar.add(Calendar.MINUTE, 1);
        heure = calendar.getTime();
        System.out.println(dateFormat.format(heure));
    }
}
