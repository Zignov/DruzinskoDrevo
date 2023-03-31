public class DruzinskoDrevo {
    public static void main (String [] args){

        Oseba mati = new Oseba("Mati", "mati", 'z' , 1980, null, null);

        Oseba oce = new Oseba("Oce", "oce", 'm', 1977, null, null);

        Oseba sin = new Oseba("Sin", "sin",'m', 2000, oce, mati);



        System.out.println(oce.starost());
        System.out.println(sin.jeStarejsaOd(mati));


        

    }
}
