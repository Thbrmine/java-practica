import java.util.Scanner;
public class ep58 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Digite la cantidad de terminos Fibonacci que desea sumar: ");
            int n = sc.nextInt();

            long a = 0, b = 1, sum = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print(a + (i < n ? " , " : " "));

                // Suma de los terminos Fibonacci
                sum += a; // Acumulador suma
                long temp = a + b;// Variable temporal para almacenar el valor 
                a = b; // El penultimo pasa a ser el anterior
                b = temp ; // El nuevo pasa a ser el penultimo
            }
            System.out.println("\nLa suma de los " + n + " terminos Fibonacci es: " + sum);
        }
       
    }
}