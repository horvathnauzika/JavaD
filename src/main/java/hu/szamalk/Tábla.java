package hu.szamalk;

public class Tábla {
    private char T[][] ;
    private char ÜresCella;

    public Tábla(char[][] t) {
        this.T = new char[8][8];
    }

    public Tábla(char üresCella){
        this.ÜresCella=üresCella;
    }

    public Tábla(char[][] t, char üresCella) {
        this.ÜresCella = üresCella;
        this.T = new char[üresCella][üresCella];
    }


}
