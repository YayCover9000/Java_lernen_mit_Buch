public class ZaehlerTest {
    private static int zaehler;

    public ZaehlerTest() {
        zaehler++;
    }

    public static void main (String [] args) {
        new ZaehlerTest();
        System.out.println(ZaehlerTest.zaehler);
        new ZaehlerTest();
        new ZaehlerTest();
        System.out.println(ZaehlerTest.zaehler);
    }
}
