import javax.swing.*;
import java.awt.*;

public class Bifurcacion extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (double r = 2.5; r <= 4.0; r += 0.002) {
            double x = 0.5;
            for (int i = 0; i < 100; i++) {
                x = r * x * (1 - x);
            }


            for (int i = 0; i < 100; i++) {
                x = r * x * (1 - x);

                int px = (int) ((r - 2.5) / (4.0 - 2.5) * getWidth());
                int py = (int) ((1 - x) * getHeight());

                g.fillRect(px, py, 1, 1);
            }

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Diagrama de Bifurcación");
        Bifurcacion panel = new Bifurcacion();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
