// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Eingabe with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Umschalt+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Umschalt+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Strg+F8.
            System.out.println("i = " + i);
        }

        //Erstellt eine Grafische Oberfläche mit den folgenden Parametern
        JFrame frame = new JFrame();
        JLabel label = new JLabel ("Viele Interessante Labels hier abgebildet",JLabel.CENTER);
        frame.add(label);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setSize (300, 200);
        frame.setVisible (true);

        //using Var as a nutreal type
        var age = 10;
        var name = "John";
        var pi = 3.14159;
        var list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        var notTrue = false;
        System.out.println("age = " + age + ", name = " + name + ", pi = " + pi + ", list = " + list + ", notTrue = " + notTrue);

        int x = 0;
        long y = 1000;
        x = (int) y; // must cast because of possible data-lost


    }

}