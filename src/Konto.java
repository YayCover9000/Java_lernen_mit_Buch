public class Konto {
    public static void InKlassenAufruf() {
    }
    private int kontonummer;
    private double saldo;
    public int getKontonummer() {
        return kontonummer;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void einzahlen(double betrag) {
        saldo += betrag;
    }
    public void auszahlen(double betrag) {
        saldo = saldo - betrag;
    }
    public void info() {
        System.out.println("Kontonummer: " + kontonummer + "\tSaldo: " + saldo);

    }


    public Konto () { }

    Konto(int kontonummer) {
        this.kontonummer = kontonummer;
    }
    public Konto (int kontonummer, double saldo) {
        setKontonummer(kontonummer);
        this.saldo = saldo;
    }
    public Konto(Konto k) {
        kontonummer = k.kontonummer;
        saldo = k.saldo;
    }
}
