public class SwichCaseTest {
    public static void main(String[] args) {
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
    }
}
