import Birra.Birra;
import Birra.BirraNoiosa;
import Cinema.Film;
import Cinema.Cineteca;

public class Main {

    public static void main(String[] args) {                
        birra();
        birraNoiosa();
        film();
    }


    private static void film() {

        Cineteca cinema = new Cineteca();

        cinema.aggiungi(new Film("Salvate il soldato Ryan", "Drammatico", 189));
        cinema.aggiungi(new Film("Il buio oltre la siepe", "Drammatico", 35));
        cinema.aggiungi(new Film("Fantozzi, il ritorno", "Commedia", 61));
        cinema.aggiungi(new Film("Vacanze di Natale", "Commedia", 55));
        cinema.aggiungi(new Film("Terminator", "Fantascienza", 73));
        cinema.aggiungi(new Film("Faranheit 11/09", "Documentario", 40));

        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("Lista dei film Commedia\n\n");
        cinema.stampaGenere("Commedia");

        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("Lista dei film più lunghi di 60 min\n\n");
        cinema.stampaDurataAlPiu(60);

        System.out.println("\n\n---------------------");
        System.out.println("---------------------");
        System.out.println("Lista di tutti i film\n\n");
        cinema.stampaTutti();
        
    }   


    private static void birra() {
        Birra birra = new Birra();
        birra.bevi(1.22);
        System.out.println(birra.getLitriRimanenti());
    }

    private static void birraNoiosa() {
        BirraNoiosa b1 = new BirraNoiosa();
        BirraNoiosa b2 = new BirraNoiosa();
        BirraNoiosa b3 = new BirraNoiosa();
        BirraNoiosa b4 = new BirraNoiosa();
        BirraNoiosa b5 = new BirraNoiosa();

        b1.bevi();
        if (b1.isVuota()==true)
        {
            System.out.println("SVUOTATA LA PRIMA!");
        }
        else
        {
            System.out.println("Nella prima birra rimangono ancora " + b1.getLitriRimanenti() + " litri."); 
        }

        b2.bevi(1.45);
        if (b2.isVuota()==true)
        {
            System.out.println("SVUOTATA LA SECONDA!"); 
        }
        else
        {
            System.out.println("Nella seconda birra rimangono ancora " + b2.getLitriRimanenti() + " litri.");
        }

        b3.bevi();
        if (b3.isVuota()==true)
        {
            System.out.println("SVUOTATA LA TERZA!");
        }
        else
        {
            System.out.println("nella terza birra rimangono ancora " + b3.getLitriRimanenti() + " litri.");
        }

        b4.bevi();
        if (b4.isVuota()==true)
        {
            System.out.println("SVUOTATA LA QUARTA!");
        }
        else 
        {
            System.out.println("nella quarta birra rimangono ancora " + b4.getLitriRimanenti() + " litri.");
        }

        b5.bevi();
        if (b5.isVuota()==true)
        {
            System.out.println("SVUOTATA LA QUINTA!");
        }
        else 
        {
            System.out.println("nella quinta birra rimangono ancora " + b5.getLitriRimanenti() + " litri.");
        }
    }

}