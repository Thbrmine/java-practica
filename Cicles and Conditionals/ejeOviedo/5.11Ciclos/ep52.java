import java.util.Scanner;
public class ep52 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un valor para n: ");
            int n = sc.nextInt();

            System.out.printf("%-10s %-10s %-20s%n", "Número", "Cuadrado", "Método");
            System.out.println("----------------------------------------------");

//Ciclo que recorre desde 1 hasta n
            for (int i = 1; i <= n; i++) {
                long sumaCuadrado = 0;
                String proceso = ""; 

                for (int j = 1; j <= i; j++) {
                    int impar = 2 * j - 1; // Calcula el número impar correspondiente
                    sumaCuadrado += impar;
                    
                    // Construye la cadena del proceso
                    if (j == 1) {
                        proceso+= impar;
                    } else {
                        proceso += " + " + impar;
                    }
                }

                System.out.printf("%-10d %-10d %-20s%n", i, sumaCuadrado, proceso);
            }
        }
    }
}