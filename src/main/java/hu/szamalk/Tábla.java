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

    public int ÜresSorokSzáma(){
        int üresSorokSzáma = 0;
        for (int i = 0; i < T.length; i++) {
            boolean uressor = false;
            for (int j = 0; j < T[i].length; j++) {
                if(T[i][j]==ÜresCella){
                    uressor=true;
                }
            }
            if(uressor){
                üresSorokSzáma++;
            }
        }
        return üresSorokSzáma;
    }

    public int ÜresOszlopokSzáma(){
        int üresOszlopokSzáma = 0;
        for (int j = 0; j < T[0].length; j++) {
            boolean üresOszlop = false;
            for (int i = 0; i < T.length; i++) {
                if(T[i][j]==ÜresCella){
                    üresOszlop=true;
                }
            }
            if(üresOszlop){
                üresOszlopokSzáma++;
            }
        }
        return üresOszlopokSzáma;
    }
    // f1 vége
}
