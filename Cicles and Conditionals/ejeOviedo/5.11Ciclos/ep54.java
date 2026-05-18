import java.util.Scanner;

public class ep54 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el valor de X: ");
            double xOriginal = sc.nextDouble();
            
            // Usamos el valor absoluto para el cálculo de la serie
            double x = Math.abs(xOriginal);
            
            double e = 1.0; // El primer término de la serie es 1
            double termino = 1.0;
            int n = 1;
            
            // Ciclo: mientras el término sea mayor a 0.000001
            while (termino > 1e-6) {
                // Calculamos el siguiente término: (x^n) / n!
                // Un truco: el término nuevo es (término_anterior * x) / n
                termino = (termino * x) / n;
                e += termino;
                n++;
            }
            
            // Si el X original era negativo, aplicamos 1 / E
            if (xOriginal < 0) {
                e = 1 / e;
            }
            
            System.out.printf("Para X = %.2f, el valor de E es: %.6f%n", xOriginal, e);
            System.out.println("Se necesitaron " + n + " términos para la precisión solicitada.");
        }
    }
}