package hu.szamalk.JatekProgram;

public class Babu extends LogikaiJatek{
    private int ero;
    private String szin;

    public Babu(String szin) {
        this.szin = szin;
    }

    public Babu(int ero, String szin) {
        this(szin);
        this.ero = ero;
    }
}
