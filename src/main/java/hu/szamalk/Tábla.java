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

    public void Megjelenit(int sor, int oszlop){
        T = new char[8][8];
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                T[i][j]=ÜresCella;
            }
        }
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                System.out.print(T[i][j]);
            }
            System.out.println();
        }
    }

}
