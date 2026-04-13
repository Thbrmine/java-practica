import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)){ 
            System.out.println("Ingrese valor para n: ");
            int n = sc.nextInt();
            int sum = 0;
            int count=0;

            while(n!=0) {
                sum += n;
                count++;
                System.out.println ("Ingrese valor para n:  ");
                n = sc.nextInt();
            }
            System.out.println("Suma "+ sum);
            System.out.println("Contador "+ count);
            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("La suma es: " + sum);
                System.out.println("El promedio es: " + average);
            } else {
                System.out.println("No se ingresaron números.");
            }
        }
    }
}