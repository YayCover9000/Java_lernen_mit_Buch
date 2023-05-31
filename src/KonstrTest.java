public class KonstrTest {
    public static void main (String[] args) {
        Konto k1 = new Konto();
        Konto k2 = new Konto(123456);
        Konto k3 = new Konto();
        Konto k4 = new Konto(k3);

        k1.info();
        k2.info();
        k3.info();
        k4.info();

    }
}
