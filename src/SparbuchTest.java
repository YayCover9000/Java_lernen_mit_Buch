public class SparbuchTest {
    public static void main (String [] args) {
        Sparbuch meinSparbuch = new Sparbuch();
        meinSparbuch.zahleEin(100);
        meinSparbuch.hebeAb(50);
        meinSparbuch.getErtrag(15);
        meinSparbuch.verzinsen();
        System.out.println(meinSparbuch.getKapital());
        System.out.println(meinSparbuch.getZinssatz());
        System.out.println(meinSparbuch.getKontonummer());
    }
}
