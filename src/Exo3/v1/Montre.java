package Exo3.v1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Montre {

    private Etat etatCourant;
    private SimpleDateFormat dateFormat;
    private Calendar calendar;
    private Date heure;

    public Montre() {
        etatCourant = new EtatAffichage();
        dateFormat = new SimpleDateFormat("HH:mm");
        calendar = Calendar.getInstance();
        heure = new Date();
        System.out.println(dateFormat.format(heure));
    }

    public void setEtatCourant(Etat etatCourant) {
        this.etatCourant = etatCourant;
    }

    public void appuyerBontonMode() {
        if (etatCourant instanceof EtatAffichage) {
            setEtatCourant(etatCourant.modifierHeure());
            System.out.println("Modification de l'heure :\n" + dateFormat.format(heure));
        }
        else if (etatCourant instanceof EtatModificationHeures) {
            setEtatCourant(etatCourant.modifierMinutes());
            System.out.println("Modification des minutes :\n" + dateFormat.format(heure));
        }
        else {
            setEtatCourant(etatCourant.passerEnAffichage());
            System.out.println(dateFormat.format(heure));
        }
    }

    public void appuyerBontonAvance() {
        if (etatCourant instanceof EtatModificationHeures) {
            calendar.add(Calendar.HOUR, 1);
            heure = calendar.getTime();
            System.out.println(dateFormat.format(heure));
        }
        else if (etatCourant instanceof EtatModificationMinutes) {
            calendar.add(Calendar.MINUTE, 1);
            heure = calendar.getTime();
            System.out.println(dateFormat.format(heure));
        }
    }
}
