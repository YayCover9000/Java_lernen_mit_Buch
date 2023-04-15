import javax.swing.*;

public class JFrameGUI {
    public static void JFrameGUIoffnen() {
        // Erstellt eine Grafische Oberfläche mit den folgenden Parametern
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Viele Interessante Labels hier abgebildet", JLabel.CENTER);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
