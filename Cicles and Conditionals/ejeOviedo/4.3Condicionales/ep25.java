import java.util.Scanner;
public class ep25 {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Ingrese 4 números distintos: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

// Mayor con if
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        if (num4 > mayor) {
            mayor = num4;
        }
        System.out.println("El número mayor es: " + mayor);
        
// Mayor con Math.max
        int mayor2= Math.max(num1, Math.max(num2, Math.max(num3, num4)));
        System.out.println("El número mayor es: " + mayor2);

       }
    }
}
