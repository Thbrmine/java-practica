import java.util.Scanner;
public class ep50 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un valor para n: ");
            int n = sc.nextInt();
// Primer ciclo que recorre desde 1 hasta n
            for (int i = 1; i <= n; i++) {
                long factorial = 1;
                String proceso = ""; 
// Segundo ciclo que calcula el factorial de i y construye la cadena del proceso
                for (int j = 1; j <= i; j++) {
                    factorial *= j;
                    
                    // Si es el primer número, no se pone el 'x' antes
                    if (j == 1) {
                        proceso += j;
                    } else {
                        proceso += " x " + j;
                    }
                }

                // Imprimimos con el formato: 3! = 1 * 2 * 3 = 6
                System.out.println(i + "! = " + proceso + " = " + factorial);
            }
        }
    }
}