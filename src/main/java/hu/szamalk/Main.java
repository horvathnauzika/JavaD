package hu.szamalk;

public class Main {
    public static void main(String[] args) {
        Tábla tábla=new Tábla('#');
        tábla.Megjelenit(8,8);
        System.out.println("9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + tábla.ÜresOszlopokSzáma() + "\n" + "Sorok: "+tábla.ÜresSorokSzáma());
    }
}