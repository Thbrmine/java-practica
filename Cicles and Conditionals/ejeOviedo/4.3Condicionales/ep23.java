import java.util.Scanner;

public class ep23 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ecuación de Segundo Grado");
            
            System.out.print("Ingrese número A: ");
            int A = sc.nextInt();
            System.out.print("Ingrese número B: ");
            int B = sc.nextInt();
            System.out.print("Ingrese número C: ");
            int C = sc.nextInt();

            double discriminante = Math.pow(B, 2) - 4 * A * C;
            if (discriminante > 0) {
                System.out.println("Hay dos soluciones:");

                double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
                System.out.println("x1 = " + x1);

                double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
                System.out.println("x2 = " + x2);

            } else if (discriminante == 0) {
                System.out.println("Hay una solución:");

                double x = -B / (2 * A);
                System.out.println("x = " + x);
            } else {
                System.out.println("No hay solucion en los reales");
            }
        }
    }
}

