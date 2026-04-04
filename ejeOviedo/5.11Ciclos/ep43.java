import java.util.Scanner;
public class ep43 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("¿Cuántas ternas de valores desea ingresar?");
            int n = sc.nextInt();

            int counTriangle=0;

            for (int i = 1; i <= n; i++){
                System.out.println("Terna " + i);
                System.out.println("Ingrese el Lado 1:");
                double a = sc.nextDouble();
                System.out.println("Ingrese el Lado 2:");
                double b = sc.nextDouble();
                System.out.println("Ingrese el Lado 3:");
                double c = sc.nextDouble();

                if (esRectangulo(a, b, c)){
                    System.out.println("Es un triángulo rectángulo.");
                    counTriangle++;
                } else {
                    System.out.println("No es un triángulo rectángulo.");
                }
            }
            System.out.println("Número de triángulos rectángulos ingresados: " + counTriangle);
        }
    }
    public static boolean esRectangulo(double a, double b, double c) {
        double max = Math.max(a, Math.max(b, c));
        double sumOfSquares = a * a + b * b + c * c - max * max;
        return Math.abs(max * max - sumOfSquares) < 1e-9; // Comparación con tolerancia
    }
}
