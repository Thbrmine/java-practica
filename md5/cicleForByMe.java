import java.util.Scanner;
class cicleForByMe {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite un número");
            int num = sc.nextInt();
            
            System.out.println("Suma de los números del 1 al " + num);
            int suma = 0;
            for (int i = 1; i <= num; i++) {
                suma += i;
            }
            System.out.println("La suma es: " + suma);
        }
    }
} 