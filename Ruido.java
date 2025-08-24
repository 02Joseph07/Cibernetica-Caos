import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ruido extends JPanel {
    private boolean conRuido = true;
    private double ruidoAmp = 0.3;
    private final Random rng = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        double r = 2.8;
        double x = 0.5;

        for (int i = 0; i < 100; i++) {
            x = siguienteX(r, x);
        }

        g.setColor(Color.BLUE);
        for (int i = 0; i < 100; i++) {
            x = siguienteX(r, x);
            int px = (int) (i * (width / 100.0));
            int py = (int) ((1 - x) * height);
            g.fillRect(px, py, 3, 3);
        }
    }

    private double siguienteX(double r, double x) {
        if (conRuido) {
            double epsilon = (rng.nextDouble() - 0.5) * 2 * ruidoAmp;
            return r * x * (1 - x) + epsilon;
        } else {
            return r * x * (1 - x);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mapa Logístico con Ruido");
        Ruido panel = new Ruido();
        frame.add(panel);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
