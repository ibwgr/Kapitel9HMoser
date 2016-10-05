/**
 * Created by Moser Harry on 04.10.2016.
 */
/** Diese Klasse modelliert die amerikanische
 Waehrung. */
public class USDollar extends Waehrung {

    /** Instanzvariable: Wert in Dollar */
    private double wert;

    /** Konstruktor */
    public USDollar(double wert) {
        this.wert=wert;
    }

    /** Fuer Dollar ist diese Methode nicht mehr abstrakt */
    public double dollarBetrag() {
        return wert;
    }

}
