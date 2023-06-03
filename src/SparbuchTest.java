public class SparbuchTest {
    public static void main (String [] args) {
        Sparbuch meinSparbuch = new Sparbuch();
        meinSparbuch.setKontonummer(123456789);
        meinSparbuch.setZinssatz(1.5F);
        meinSparbuch.zahleEin(100);
        meinSparbuch.hebeAb(50);

        meinSparbuch.verzinsen();
        System.out.println(meinSparbuch.getKapital());
        System.out.println(meinSparbuch.getZinssatz());
        System.out.println(meinSparbuch.getKontonummer());
        System.out.println(meinSparbuch.getErtrag(10));
    }
}
