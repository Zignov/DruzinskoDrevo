class Oseba{
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce;
    private Oseba mati;



    Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati){
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
        this.oce = oce;
        this.mati = mati;
    }



    public String vrniIme(){
        return ime +" "+ priimek;
    }

    public int starost(){
        return (2023-letoRojstva);
    }

    public String toString(){
        return (vrniIme() + ", " + spol + ", " + letoRojstva);
    }

    public boolean jeStarejsaOd(Oseba oseba){
        return(letoRojstva < oseba.letoRojstva);
    }

    public boolean jeBratAliSestra (Oseba oseba){
        return(mati == oseba.mati && oce == oseba.oce);
    }



    public String imeOceta(){
        if (oce != null){
            return(oce.vrniIme());
        }
        else{
            return null;
        }
    }

    public String imeMatere(){
        if (mati != null){
            return(oce.vrniIme());
        }
        else{
            return null;
        }
    }
}