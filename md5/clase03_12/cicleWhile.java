
import java.util.Scanner;
class cicleWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i < 5 ) {
            System.out.println("Hello  mundo! " + i);
            i++;
        }  

        System.out.println("Ingrese un número: ");

        int j = 0;
       try (Scanner sc = new Scanner(System.in)) {
        long  numero = sc.nextLong();
        while (numero > 0) {
            numero /= 10; 
            j++;
        }
        System.out.println("El número tiene " + j + " dígitos.");
       }
    }
}