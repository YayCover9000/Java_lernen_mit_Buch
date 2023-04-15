public class Aufgaben_Kapitel_3 {
    public static void InKlassenAufruf() {
        FlascheninKisten();
        teilbarkeit();
        Uhrzeit();
        sekundenImJanuar();
        WelcheWerteHabenDieAusdruecke();
        Kreisberechnen();
    }
    public static void FlascheninKisten() {
        int x = 47;
        int n = 5;

        System.out.println("Anzahl Kartons: " + x / n);
        System.out.println("Rest: " + x % n);
    }
    public static void teilbarkeit() {
        int x = 123456789;
        int y = 3;

        String ergebnis = (x % y == 0) ? "teilbar" : "nicht teilbar";

        System.out.println(x + " ist durch " + y + " " + ergebnis + ".");
    }
    public static void Uhrzeit() {
        int x = 20;
        int n = 8;

        System.out.println((x + n) % 24);
    }
    public static void sekundenImJanuar() {
        long sek;

        sek = 31 * 24 * 60 * 60;
        System.out.println("Der Monat Januar hat " + sek + " Sekunden.");
    }
    public static void WelcheWerteHabenDieAusdruecke() {
        int a = 1, b = 7;
        System.out.println("a) Ausdruck: " + --a + "\ta: " + a + "\tb: " + b);

        a = 1;
        b = 7;
        System.out.println("b) Ausdruck: " + a-- + "\ta: " + a + "\tb: " + b);

        a = 1;
        b = 7;
        System.out.println("c) Ausdruck: " + (a++ + b) + "\ta: " + a + "\tb: " + b);

        a = 1;
        b = 7;
        System.out.println("d) Ausdruck: " + (b = ++a) + "\ta: " + a + "\tb: " + b);

        a = 1;
        b = 7;
        System.out.println("e) Ausdruck: " + (a = b++) + "\ta: " + a + "\tb: " + b);

        a = 1;
        b = 7;
        System.out.println("f) Ausdruck: " + (-(a--) - -(--b)) + "\ta: " + a + "\tb: " + b);

        a = 1;
        b = 7;
        System.out.println("g) Ausdruck: " + (a++ + ++a + a++) + "\ta: " + a + "\tb: " + b);
    }
    public static void Kreisberechnen() {
        double PI = 3.14159;
        double r = 1.5;

        System.out.println("Durchmesser: " + 2 * r);
        System.out.println("Umfang: " + 2 * PI * r);
        System.out.println("Fläche: " + PI * r * r);
    }
}
