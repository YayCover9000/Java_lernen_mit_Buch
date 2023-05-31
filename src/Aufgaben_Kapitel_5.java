public class Aufgaben_Kapitel_5 {
    public static void InKlassenAufruf() {
        Kapitel_5_Mitschriften();
        System.out.println();
        Projekt_5_1();
        System.out.println();
        Projekt_5_1_Matrix();
        System.out.println();
        Projekt_5_1_Matrix_Dreieck_eigene();
        System.out.println();
        Projekt_5_1_Kommandozeile(new String[]{"Hallo", "ich", "bin", "ein", "Parameter"});
        System.out.println();
        Aufgabe_5_1();
        System.out.println();
        Aufgabe_5_2();
        System.out.println("______________________________________");
        Aufgabe_5_3();
        System.out.println("Musterloesung Aufgabe 5 3\n");
        Aufgabe_5_3_Musterloesung();
    }

    public static void Kapitel_5_Mitschriften() {
        int[] Array = new int[10];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = i + 1;
        }
        int[][] x;
        x = new int[2][];
        for (int i = 0; i < 2; i++)
            x[i] = new int[3];
    }

    //Projetk 5.1
    public static void Projekt_5_1() {
        int[] zahlen = new int[10];
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = i * 100;
        }
            /*for (int i = 0; i < zahlen.length; i++) {
                System.out.print(zahlen[i] + " ");
            }*/
        for (int x : zahlen) {
            System.out.print(x + " ");
        }
        System.out.println();
        String[] tage = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
           /* for (int i = 0; i < tage.length; i++) {
                System.out.print(tage[i] + " ");
            }*/
        for (String tag : tage) {
            System.out.print(tag + " ");
        }
    }
    public static void Projekt_5_1_Matrix() {
        int[][] x = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(x.length);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i].length);
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("(" + i + "," + j + "): " + x[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void Projekt_5_1_Matrix_Dreieck_eigene () {
        int maxErstArray = 11;
        int maxZweitArray = 11;
        int [][] multDimArray = new int [maxErstArray][maxZweitArray];
        for (int i = 1; i < maxErstArray; i++) {
            for (int j = 0; j < maxZweitArray; j++) {
                multDimArray[i][j] = i * j;
                System.out.print(multDimArray[i][j] +  " ");
            }
            System.out.println();
        }
    }
    public static void Projekt_5_1_Kommandozeile(@org.jetbrains.annotations.NotNull String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + ". Parameter: " + args[i]);
        }
    }
    public static void Aufgabe_5_1 () {
        int[] arbeitsarray;
        arbeitsarray = new int[11];
        int kleinste = arbeitsarray[0];
        int groesstes = arbeitsarray.length;
        int mittlererWert = 0;
        for (int i = 0; i < arbeitsarray.length; i++) {
            arbeitsarray[i] = i;
        }
        if (arbeitsarray == null) {
                System.out.println("Array == Null");
        } else if (arbeitsarray != null) {
            for (int j = 0; j < arbeitsarray.length; j++) {
                    mittlererWert = mittlererWert + arbeitsarray[j];
            }
        }
        mittlererWert = mittlererWert / arbeitsarray.length;
        System.out.println("Kleinster = " + kleinste + " mitte = " + mittlererWert + " groesste = " + groesstes);
    }
    public static void Aufgabe_5_2() {
        int[][] zwanzigxzwanzig = new int[20][20];

        for (int i = 0; i < zwanzigxzwanzig.length; i++) {
            for (int j = 0; j < zwanzigxzwanzig[i].length; j++) {
                zwanzigxzwanzig[i][j] = i * j;
                System.out.print(" " + zwanzigxzwanzig[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Aufgabe_5_3() {
        int l = 2;
        int m = 3;
        int n = 4;
        double[][] A = {{1., 2., 3.}, {4., 5., 6.}};
        double[][] B = {{0., 1., 2., 1}, {2., 1., 3., 2.}, {1., 0., 4., 1.}};

        double[][] C = new double[l][n];

        for (int i = 0; i < l; i++) {
            for(int k = 0; k < n; k++) {
                for(int j = 0; j < m; j++) {
                    C[i][k] += A[i][j] * B[j][k];
                }
            }
        }
        for (int i = 0; i < l; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(C[i][k] + " ");
            }
            System.out.println();
        }
    }
    public static void Aufgabe_5_3_Musterloesung () {
        int l = 2, m = 3, n = 4;

        double[][] A = {{1., 2., 3.}, {4., 5., 6.}};
        double[][] B = {{0., 1., 2., 1}, {2., 1., 3., 2.}, {1., 0., 4., 1.}};

        double[][] C = new double[l][n];

        for (int i = 0; i < l; i++) {
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < m; j++) {
                    C[i][k] += A[i][j] * B[j][k];
                }
            }
        }

        for (int i = 0; i < l; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(C[i][k] + " ");
            }
            System.out.println();
        }
    }
}
