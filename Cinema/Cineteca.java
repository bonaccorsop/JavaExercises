package Cinema;

import java.util.ArrayList;
import java.util.Iterator;

public class Cineteca {

    private ArrayList<Film> films = new ArrayList<Film>();

    public boolean aggiungi(Film f) {
        return this.films.add(f);
    }

    public void stampaTutti() {
        Iterator<Film> i = this.films.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public void stampaGenere(String g) {
        Iterator<Film> i = this.films.iterator();
        while (i.hasNext()) {
            Film f = i.next();
            if(f.genere == g) {
                System.out.println(f);
            }            
        }
    }

    public void stampaDurataAlPiu(int d) {
        Iterator<Film> i = this.films.iterator();
        while (i.hasNext()) {
            Film f = i.next();
            if(f.durata >= d) {
                System.out.println(f);
            }            
        }
    }

}