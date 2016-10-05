/**
 * Created by Moser Harry on 04.10.2016.
 */
/** Die Waehrung Europas */
public class Euro extends Waehrung {

    /** Ein Euro ist soviel Dollar wert */
    private static double kurs=1;

    /** Instanzvariable: Wert in Euro */
    private double wert;

    /** Konstruktor */
    public Euro(double wert) {
        this.wert=wert;
    }

    /** Deklaration der sonst abstrakten Methode dollarBetrag */
    public double dollarBetrag() {
        return wert*kurs;
    }

    /** Gibt den Wert der Waehrung in Euro zurueck */
    public double euroBetrag() {
        return wert;
    }

    /** Zugriff auf die private Klassenvariable */
    public static void setEuroKurs(double Kurs) {
        kurs=Kurs;
    }

}