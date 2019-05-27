package Birra;

public class Birra {

    private Double litriRimanenti = 2.0;

    public Birra() {        
        this.litriRimanenti = 2.0;
    }

    // overload del costruttore con i litri iniziali di birra specificati
    public Birra(Double litri) {        
        this.litriRimanenti = litri;
    }

    public Double getLitriRimanenti() {
        return this.litriRimanenti;
    }
    
    public boolean bevi() {
        return this.bevi(this.litriRimanenti);
    }
    
    // overload del metodo Bevi con il quantitativo da bere specificato
    public boolean bevi(double litriDesiderati) {
        double rimanenti = this.litriRimanenti - litriDesiderati;

        if(rimanenti < 0) {
            return false;
        } 

        this.litriRimanenti = rimanenti;
        return true;
    }


    public boolean isVuota() {
        return this.litriRimanenti == 0;
    }
}