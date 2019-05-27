package Cinema;

public class Film {

    public String titolo;
    public String genere; 
    public int durata = 0;

    public Film(String titolo, String genere, int durata) {
        this.titolo = titolo;
        this.genere = genere;
        this.durata = durata;
    }

    @Override
    public String toString() {
        return this.titolo + " - " + this.genere + " (" + this.durata + " minuti)";
    }

}