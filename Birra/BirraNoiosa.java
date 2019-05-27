package Birra;

public class BirraNoiosa extends Birra {

    protected static int birreBevute = 0;

    // override del metodo bevi della classe principale Birra
    @Override
    public boolean bevi(double litriDesiderati) {

        if(birreBevute >= 3) {
            System.out.println("Fermati! Devi guidare!!!");
            return false;
        }

        Boolean isOk = super.bevi(litriDesiderati);

        if(isOk && this.isVuota()) {
            birreBevute = birreBevute + 1;
            System.out.println("birre bevute: " + birreBevute);
        }        
                
        return isOk;
    }   

}