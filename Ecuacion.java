public class Ecuacion {
    public static void main(String[] args) {
        double r = 3.2;
        double x = 0.5;
        int ite = 50;

        for(int n = 0; n < ite; n++){
            x = r * x * (1-x);
            System.out.printf("Iteración %2d: %.5f%n", n, x);
        }
    }
}