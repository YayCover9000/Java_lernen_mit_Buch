public class WhileTest {
    public static void whileTest() {
        int n = 100, summe = 0, i = 1;
        while (i <= n) {
            summe = summe + i; // oder summe += i;
            System.out.println("summe = " + summe);
            i = i + 1; // oder i++
            System.out.println("i = " + i);
        }
        System.out.println("Die Summe von 1 bis " + n + " ist " + summe);
    }
}
