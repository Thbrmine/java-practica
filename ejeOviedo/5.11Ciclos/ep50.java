import java.util.Scanner;
public class ep50 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un valor para n: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                long factorial = 1;
                String proceso = ""; // Aquí guardaremos la cadena "1 * 2 * 3..."

                for (int j = 1; j <= i; j++) {
                    factorial *= j;
                    
                    // Si es el primer número, no ponemos el '*' antes
                    if (j == 1) {
                        proceso += j;
                    } else {
                        proceso += " * " + j;
                    }
                }

                // Imprimimos con el formato: 3! = 1 * 2 * 3 = 6
                System.out.println(i + "! = " + proceso + " = " + factorial);
            }
        }
    }
}