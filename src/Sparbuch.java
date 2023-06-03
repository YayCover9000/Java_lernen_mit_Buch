public class Sparbuch {
    private int kontonummer;
    private float zinssatz;
    private float kapital;

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public float getZinssatz() {
        return zinssatz;
    }

    public void setZinssatz(float zinssatz) {
        this.zinssatz = zinssatz;
    }

    public float getKapital() {
        return kapital;
    }

    public void setKapital(float kapital) {
        this.kapital = kapital;
    }

    public void zahleEin (float betrag){
        kapital += betrag;
    }
    public void hebeAb (float betrag){
        kapital -= betrag;
    }
    public void verzinsen(){
        kapital = kapital * (1 + zinssatz / 100);
    }
    public float getErtrag (int laufzeit) {
        float ertrag = kapital;
        for (int i = 0; i < laufzeit; i++) {
            ertrag = ertrag * (1 + zinssatz / 100);
        }
        return ertrag - kapital;
    }
    Sparbuch() {
        kontonummer = 0;
        zinssatz = 0;
        kapital = 0;
    }
    Sparbuch(int kontonummer, float zinssatz, float kapital) {
        this.kontonummer = kontonummer;
        this.zinssatz = zinssatz;
        this.kapital = kapital;
    }
}
