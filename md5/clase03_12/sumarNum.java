import java.util.Scanner;

class sumarNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
        // preguntar cuántos números se van a sumar
        System.out.print("¿Cuántos números desea sumar? ");
        int n = sc.nextInt();

        System.out.println("First with for loop:");
        
        int suma = 0; // acumulador para la suma
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = sc.nextInt(); // numero ingresado por el usuario
            suma += num; // suma = suma + num 
        }
        System.out.println("La suma de los " + n + " números es: " + suma);

        System.out.println("Now with while loop:");
        int i = 0;
        int j = 0;// acumulador para la suma
        
        while (i < n) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int num = sc.nextInt(); // numero ingresado por el usuario
            j += num; // j = j + num
            i++;
        }
        System.out.println("La suma de los " + n + " números es: " + j);
        }

    }
}