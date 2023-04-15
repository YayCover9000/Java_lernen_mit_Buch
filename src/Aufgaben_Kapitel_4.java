public class Aufgaben_Kapitel_4 {
    public static void InKlassenAufruf() {
        SwichCaseTest();
        Sternchen();
        Quersummer();
        Primfaktorzerlegung();
        KleinesEInMalkEins();
        fakultaet();
        vergleich();
        KleinsteGanzzahligeZahl();
        Zinsen();
    }
    public static void SwichCaseTest() {
        char op = 'x'; //der Charakter wird getestet

        // Beispiel 1
        switch (op) {
            case '*':
            case 'x':
                System.out.println("Multiplikation");
                break;
            case ':':
            case '/':
                System.out.println("Division");
        }

        // Beispiel 2
        switch (op) {
            case '*', 'x' -> /*kann verwendet werden*/ System.out.println("Multiplikation");
            case ':', '/' -> {
                String s = "Division";
                System.out.println(s);
            }
        }

        // Beispiel 3
        /*yield = ertrag (aus dem Englischen)
        yield zur Rückgabe oder eine nicht kontrollierte Ausnahme ist erforderlich. Ein
        Durchfallen ist möglich.*/
        String result1 = switch (op) {
            case '*':
            case 'x':
                yield "Multiplikation";
            case ':', '/':
                String s = "Division";
                yield s;
            default:
                yield "Unbekannt";
        };
        System.out.println(result1);

        // Beispiel 4
        /*Hinter dem Pfeil -> steht entweder ein Ausdruck,
        ein Block in geschweiften Klammern oder eine throw-Anweisung,
        die eine nicht kontrollierte Ausnahme auslöst.*/
        String result2 = switch (op) {
            case '*', 'x' -> "Multiplikation";
            case ':', '/' -> {
                String s = "Division";
                yield s;
            }
            default -> "Unbekannt";
        };
        System.out.println(result2);

        // Beispiel 5
        int zahl = 4;

        switch (zahl) {
            case 6:
            case 8:
                System.out.println("Knapp daneben");
                break;
            case 7:
                System.out.println("Treffer");
                break;
            default:
                System.out.println("Weit daneben");
        }
    }
    public static void Sternchen() {
        int zeile, spalte;

        for (zeile = 1; zeile <= 10; zeile++) {
            for (spalte = 1; spalte <= zeile; spalte++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
    public static void Quersummer() {
        int x = 12389;

        int quersumme = 0;
        while (x > 0) {
            quersumme = quersumme + x % 10;
            x = x / 10;
        }

        System.out.println("Quersumme: " + quersumme);
    }
    public static void Primfaktorzerlegung() {
        int n = 18844;
        int t = 2;

        while (n > 1) {
            if (n % t == 0) {
                n = n / t;
                System.out.println(t);
            } else {
                t++;
            }
        }
    }
    public static void KleinesEInMalkEins() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
    public static void fakultaet() {
        int n = 20; // Überlauf, wenn n > 20

        long fak = 1;
        for (int i = 1; i <= n; i++) {
            fak *= i;
        }

        System.out.println(fak);
    }
    public static void vergleich() {
        double x = 1.23;
        double y = 1.234;
        double z = 0.01;

        double abs = (x - y < 0) ? y - x : x - y;

        if (abs < z)
            System.out.println(0);
        else if (x < y)
            System.out.println(-1);
        else
            System.out.println(1);
    }
    public static void KleinsteGanzzahligeZahl() {
        int x = 15;

        int n = 0;
        for (int z = 1; z < x; n++) {
            z *= 2;
        }

        System.out.println(n);
    }
    public static void Zinsen() {
        double kapital = 5000., zinsen = 1.5;

        kapital += kapital * zinsen / 100.;
        System.out.println("Guthaben nach einem Jahr: " + kapital);
    }
}
