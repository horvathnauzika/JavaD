package hu.szamalk;

import hu.szamalk.JatekProgram.LogikaiJatek;

public class Main {
    public static void main(String[] args) {
        Tábla tábla=new Tábla('#');
        tábla.Megjelenit(8,8);
        System.out.println("9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + tábla.ÜresOszlopokSzáma() + "\n" + "Sorok: "+tábla.ÜresSorokSzáma());

        // f2
        LogikaiJatek j1 = new LogikaiJatek(10);
        j1.kezd();
    }
}