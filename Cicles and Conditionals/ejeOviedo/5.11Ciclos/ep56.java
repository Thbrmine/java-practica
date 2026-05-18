import java.util.Scanner;

public class ep56 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el valor de X: ");
            double x = sc.nextDouble();
            System.out.print("Ingrese cuántos términos desea sumar: ");
            int n = sc.nextInt();

            double sumaTotal = 0;

            for (int i = 1; i <= n; i++) {
                // 1. Calcular la potencia: X^i
                double potencia = Math.pow(x, i);

                // 2. Calcular el factorial de (2*i)
                long factorial = 1;
                for (int j = 1; j <= (2 * i); j++) {
                    factorial *= j;
                }

                // 3. Calcular el término completo: (i * X^i) / (2*i)!
                double termino = (i * potencia) / factorial;
                
                sumaTotal += termino;

                System.out.printf("Término %d: %.6f%n", i, termino);
            }

            System.out.printf("%nLa suma total de los %d términos es: %.8f%n", n, sumaTotal);
        }
    }
}