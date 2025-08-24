import javax.swing.*;
import java.awt.*;

public class Lorenz extends JPanel {
    private double[] xs, zs;

    public Lorenz() {
        int pasos = 10000;
        xs = new double[pasos];
        zs = new double[pasos];

        double sigma = 10.0;
        double rho = 28.0;
        double beta = 8.0 / 3.0;

        double x = 1.0, y = 1.0, z = 1.0;
        double dt = 0.01;

        for (int i = 0; i < pasos; i++) {
            double dx = sigma * (y - x);
            double dy = x * (rho - z) - y;
            double dz = x * y - beta * z;

            x += dx * dt;
            y += dy * dt;
            z += dz * dt;

            xs[i] = x;
            zs[i] = z;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        g.setColor(Color.BLUE);

        double minX = -30, maxX = 30;
        double minZ = 0, maxZ = 60;

        for (int i = 0; i < xs.length; i++) {
            int px = (int) ((xs[i] - minX) / (maxX - minX) * width);
            int py = (int) ((maxZ - zs[i]) / (maxZ - minZ) * height);
            g.fillRect(px, py, 1, 1);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lorenz 2D");
        Lorenz panel = new Lorenz();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
