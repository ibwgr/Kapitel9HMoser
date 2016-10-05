import Prog1Tools.IOTools;

/**
 * Created by Moser Harry on 04.10.2016.
 */
public class Waehrungskalkulator {

    public static void main(String[] args) {

        double dmBetrag;
        Euro betrag;
        Lire lire;
        France franc;

        dmBetrag = IOTools.readDouble( "DM-Betrag > " );
        betrag = new DM( dmBetrag );

        lire  = new Lire ( betrag );
        franc = new France( betrag );

        System.out.println( "in Euro:  " + betrag.euroBetrag()     );
        System.out.println( "in Lire:  " + lire.waehrungsBetrag()  );
        System.out.println( "in Franc: " + franc.waehrungsBetrag() );

    }

}
