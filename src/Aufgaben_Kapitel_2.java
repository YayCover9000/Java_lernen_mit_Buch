public class Aufgaben_Kapitel_2 {
    public static void Aufgabe_2_1  (){
        //Aufgabe 2.2
        //Erstelle ein Programm, das die Summe der Zahlen von 1 bis 100 berechnet und ausgibt.
        int x = 0;
        long y = 1000;
        x = (int) y; // must cast because of possible data-lost

        //Aufgabe 2.3
        /*Schreiben Sie ein Programm, das mit einem einzigen Aufruf der Java-Anweisung System.out.print eine Zeichenkette in mehreren Zeilen auf dem
        Bildschirm ausgibt.*/
        System.out.print("Hallo\tWelt\t!\n");

        int g = 0xAA00;
        int k = 0b10101010;
        var h = 0xAA00;
        var t = 0b10101010;

        System.out.println(g);
        System.out.println(k);
        System.out.println(h);
        System.out.println(t);

    }
}
