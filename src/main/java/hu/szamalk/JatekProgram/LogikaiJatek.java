package hu.szamalk.JatekProgram;

import java.util.Arrays;

public class LogikaiJatek extends Jatek{
    private Babu tabla[][];
    private int sorrend[];
    private int babuDb;

    public LogikaiJatek() {
        this.tabla = new Babu[4][5];
        this.sorrend = new int[10];
        this.babuDb = 3;
    }

    public LogikaiJatek(int babuDb) {
        if (babuDb < 2 || babuDb > 15) {
            throw new IllegalArgumentException("A babuDb értékének 2 és 15 között kell lennie!");
        }
        this.babuDb = babuDb;
    }

    public boolean van8FelettEro(){
        return false;
    }

    @Override
    public void kezd(){
        System.out.println("Kezdés");
        babuDb=3;
    }

    @Override
    public void ment(){
        System.out.println("Mentés");
    }

    @Override
    public void vege(){
        System.out.println("Vége");
        babuDb=10;
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "tabla=" + Arrays.toString(tabla) +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", babuDb=" + babuDb +
                '}';
    }
}
